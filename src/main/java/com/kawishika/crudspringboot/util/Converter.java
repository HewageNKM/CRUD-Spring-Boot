package com.kawishika.crudspringboot.util;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class Converter {
    private final ModelMapper modelMapper = new ModelMapper();

    public <T> T convertToDto(Object object, Class<T> clazz) {
        return modelMapper.map(object, clazz);
    }
    public <T> T convertToEntity(Object object, Class<T> clazz) {
        return modelMapper.map(object, clazz);
    }
    public <T>List<T> convertToListDto(List<?> list, Class<T> clazz) {
        List<T> resultList = list.stream()
                .map(entity -> modelMapper.map(entity, clazz))
                .collect(Collectors.toList());
        return resultList;
    }
    public <T>List<T> convertToListEntity(List<?> list, Class<T> clazz) {
        List<T> resultList = list.stream()
                .map(dto -> modelMapper.map(dto, clazz))
                .collect(Collectors.toList());
        return resultList;
    }
}
