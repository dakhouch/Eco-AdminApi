package com.dakhouch.anass.ecoadminapi.Service.ImageService;

import com.dakhouch.anass.ecoadminapi.Model.Image;
import com.dakhouch.anass.ecoadminapi.Repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageRepo imageRepo;

    @Override
    public List<Image> saveFile(MultipartFile[] files) throws Exception {
        List<Image> imageList=new ArrayList<>();
        for (MultipartFile file : files) {
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            try {
                if (fileName.contains("..")) {
                    throw new Exception("Filename contains invalid path sequence "
                            + fileName);
                }
                Image image = new Image();
                image.setFileName(fileName);
                image.setData(file.getBytes());
                imageList.add(image);
            } catch (Exception e) {
                throw new Exception("Could not save File: " + fileName);
            }
        }
        return imageList;
    }
}