package com.elti.recipeproject.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by e.sh. on 04-Oct-2018.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
