package cn.dutyujm.controller;

import cn.dutyujm.config.AjaxResponse;
import cn.dutyujm.pojo.Notes;
import cn.dutyujm.service.NotesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Null;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Notes")
@Api(tags = "Notes-Controller", description = "笔记")
public class NotesController {

    @Autowired
    private NotesService notesService;

    /**
     * 得到前五个笔记
     * @return
     */
    @ApiOperation("得到 前五个笔记")
    @RequestMapping(value = "/firstNotes",method = RequestMethod.GET)
    public List<Notes> getNotes(){
        return notesService.getNotes(5);
    }

    /**
     * 获取所有笔记，可以按类型进行模糊查询
     * @param title
     * @param page
     * @param limit
     * @return
     */
    @ApiOperation("获取所有笔记，可以按类型进行模糊查询")
    @RequestMapping(value = "/allNotes",method = RequestMethod.GET)
    public List<Notes> getAllNotes(@ApiParam("模糊查询字段") @RequestParam(defaultValue = "") String title
            ,@ApiParam("页数") @RequestParam(defaultValue = "1") Integer page
            ,@ApiParam("每页个数") @RequestParam(defaultValue = "100") Integer limit){
        return notesService.getAllNotes(title,page,limit);
    }

    /**
     * 笔记的添加
     * @param notes
     * @return
     */
    @ApiOperation("笔记的添加")
    @RequestMapping(value = "/insertNotes",method = RequestMethod.POST)
    public Integer insertNotes(@ApiParam("notes类型的body") @RequestBody Notes notes){
        notes.setCreattime(new Date());
        return notesService.insert(notes);
    }

    /**
     * 笔记的查找
     * @param nid
     * @return
     */
    @ApiOperation("某个笔记的查找")
    @RequestMapping(value = "/searchNotes",method = RequestMethod.GET)
    public Notes searchNotes(@ApiParam("笔记的nid") @RequestParam("nid") Integer nid){
        return notesService.selectByPrimaryKey(nid);
    }

    /**
     * 笔记的修改
     * @param notes
     * @return
     */
    @ApiOperation("笔记的修改")
    @RequestMapping(value = "/update" ,method =  RequestMethod.POST)
    public  Integer update(@ApiParam("notes类型的body") @RequestBody Notes notes){
        return  notesService.updateByPrimaryKey(notes);

    }

    /**
     * 笔记删除
     * @param nid
     * @return
     */
    @ApiOperation("笔记的删除")
    @RequestMapping(value = "/delete" ,method =  RequestMethod.POST)
    public  Integer delete(@ApiParam("笔记的nid") @RequestParam("nid") Integer nid){
        return  notesService.deleteByPrimaryKey(nid);

    }






}
