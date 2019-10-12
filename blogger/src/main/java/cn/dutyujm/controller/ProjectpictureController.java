package cn.dutyujm.controller;

import cn.dutyujm.pojo.Projectpicture;
import cn.dutyujm.pojo.Schoolexperience;
import cn.dutyujm.service.ProjectpictureService;
import cn.dutyujm.util.FileUtil;
import com.github.tobato.fastdfs.domain.MateData;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.sun.xml.internal.bind.v2.TODO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("/Projectpicture")
@Api(tags = "Projectpicture-Controller", description = "项目图片")

public class ProjectpictureController {
    @Autowired
    private ProjectpictureService projectpictureService;

    @Autowired
    private FastFileStorageClient fastFileStorageClient;

    @Value("${fdfs.reqHost}")
    private String reqHost;

    @Value("${fdfs.reqPort}")
    private String reqPort;
    /**
     * 通过pid获取图片
     * @param pid
     * @return
     */
    @ApiOperation("通过pid获取图片")
    @RequestMapping(value = "/getPicture",method = RequestMethod.GET)
    public List<Projectpicture> getPicture( @ApiParam("项目经历的pid")  @RequestParam("pid")Integer pid){
        return projectpictureService.getPicture(pid);

    }


    /**
     * 增加项目图片
     * @return
     */
    @ApiOperation("增加项目图片")
    @RequestMapping(value = "/insertProjectpicture",method = RequestMethod.POST)
    public Integer insertProjectpicture(@ApiParam("项目图片的数组")@RequestBody List<Projectpicture> projectpictures){
        return projectpictureService.insertProjectpicture(projectpictures);
    }

    /**
     * 增加一张项目图片
     * @return
     */
    @ApiOperation("增加项目图片")
    @RequestMapping(value = "/insertOneProjectpicture",method = RequestMethod.POST)
    public Integer insertOneProjectpicture(@ApiParam("项目图片类")@RequestBody Projectpicture projectpicture){
        return projectpictureService.insert(projectpicture);
    }



    /**
     * 删除项目图片
     * @return
     */
    @ApiOperation("删除项目图片")
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public Integer deleteProjectpicture( @ApiParam("项目经历的pid") @RequestParam("pid") Integer pid ,@ApiParam("图片的地址") @RequestParam("url") String url){
        return projectpictureService.delete(pid,url);
    }


    /**
     * 删除项目图片
     * @return
     */
    @ApiOperation("删除项目图片")
    @RequestMapping(value = "/deleteBybody",method = RequestMethod.POST)
    public Integer deleteProjectpictureBybody(@ApiParam("项目图片类")@RequestBody Projectpicture projectpicture){
        return projectpictureService.deleteBybody(projectpicture);
    }
    /**
     * 图片上传接口
     * @param file
     * @param pid
     * @return
     */
    @ApiOperation("上传项目图片")
    @RequestMapping(value="/testuploadimg", method = RequestMethod.POST)
    public  String testuploadimg(@ApiParam("图片")@RequestParam("file") MultipartFile file,@ApiParam("项目id")@RequestParam("pid") Integer pid) {
        String info = null;
        System.out.println("dsadsad");
        String fileName = file.getOriginalFilename();

        try {
            info = FileUtil.uploadFile(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Projectpicture projectpicture = new Projectpicture();
        projectpicture.setPid(pid);
        projectpicture.setUrl("http://172.31.51.251:8080/photo/"+fileName);
        projectpictureService.insert(projectpicture);
        return "http://172.31.51.251:8080/photo/"+fileName;
    }

    /**
     *  图片上传接口（正式）
     * @param file
     * @param pid
     * @return
     * @throws IOException
     */
    @ApiOperation("上传项目图片(正式)")
    @RequestMapping(value="/uploadImg", method = RequestMethod.POST)
    public String uploadImg(@ApiParam("图片")@RequestPart(value = "file") MultipartFile file,@ApiParam("项目id")@RequestParam("pid") Integer pid) throws IOException {
        System.out.println("到我啦");
        return projectpictureService.uploadImg(file,pid);

    }




}
