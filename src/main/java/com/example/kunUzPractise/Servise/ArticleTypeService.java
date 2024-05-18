package com.example.kunUzPractise.Servise;

import com.example.kunUzPractise.Entity.ArticleTypeEntity;
import com.example.kunUzPractise.Repository.ArticleTypeRepository;
import com.example.kunUzPractise.dto.ArticleTypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleTypeService {

    @Autowired
    private ArticleTypeRepository articleTypeRepository;

    public ArticleTypeDto create(ArticleTypeDto articleTypeDto) {
        ArticleTypeEntity articleTypeEntity = new ArticleTypeEntity();
        articleTypeEntity.setNameUz(articleTypeDto.getNameUz());
        articleTypeEntity.setNameRu(articleTypeDto.getNameRu());
        articleTypeEntity.setNameEn(articleTypeDto.getNameEn());
        articleTypeEntity.setOrderNumber(articleTypeDto.getOrderNumber());
        articleTypeRepository.save(articleTypeEntity);
        articleTypeDto.setCreatedDate(articleTypeEntity.getCreatedDate());
        articleTypeDto.setId(articleTypeEntity.getId());
        articleTypeDto.setVisible(articleTypeEntity.getVisible());
        return articleTypeDto;

    }
}
