package com.dakhouch.anass.ecoadminapi.Controller;


import com.dakhouch.anass.ecoadminapi.Model.Image;
import com.dakhouch.anass.ecoadminapi.Model.Product;
import com.dakhouch.anass.ecoadminapi.Service.ImageService.ImageService;
import com.dakhouch.anass.ecoadminapi.Service.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin("http://localhost:3000/")
@RestController
public class  ImageController {
    @Autowired
    ImageService imageService;
    @Autowired
    ProductService productService;
    @PostMapping("/uploadimage")
    public void uploadFile(@RequestParam("file[]")MultipartFile[] files,@RequestParam("product") Long product_id) throws Exception {
     List<Image> images =imageService.saveFile(files);
     Product product=productService.getProduct(product_id);
     product.setImages(images);
     productService.saveProduct(product);
    }

}

