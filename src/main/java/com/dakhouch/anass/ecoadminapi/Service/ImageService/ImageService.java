package com.dakhouch.anass.ecoadminapi.Service.ImageService;

import com.dakhouch.anass.ecoadminapi.Model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageService {
   List<Image> saveFile(MultipartFile[] files)throws Exception;
}
