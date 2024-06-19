package com.productsmicro.controllers.impl;

import com.productsmicro.constants.ApiResponseConstants;
import com.productsmicro.controllers.GenreController;
import com.productsmicro.entities.Genre;
import com.productsmicro.models.GenreDto;
import com.productsmicro.publics.ResponseApi;
import com.productsmicro.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/genres")
public class GenreControllerImpl implements GenreController<GenreDto> {

    private GenreService genreService;

    @Autowired
    public GenreControllerImpl(GenreService genreService) {
        this.genreService = genreService;
    }

    @Override
    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ResponseApi<List<GenreDto>>> listAll() {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.genreService.listAll(), ApiResponseConstants.GET_DATA_SUCCESS));
    }

    @Override
    @GetMapping(value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ResponseApi<GenreDto>> getById(@PathVariable String id) {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.genreService.getById(id), ApiResponseConstants.GET_DATA_SUCCESS));
    }

    @Override
    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<GenreDto>> create(@RequestBody GenreDto entity) {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.genreService.create(entity), ApiResponseConstants.GET_DATA_SUCCESS));
    }

    @Override
    @PostMapping(value = "/createMany", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<List<GenreDto>>> createMany(@RequestBody List<GenreDto> entities) {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.genreService.createMany(entities), ApiResponseConstants.GET_DATA_SUCCESS));
    }

    @Override
    public ResponseEntity<ResponseApi<GenreDto>> update(GenreDto entityToModify, String id) {
        return null;
    }

    @Override
    @DeleteMapping(value = "/deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<GenreDto>> deleteById(@PathVariable String id) {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.genreService.deleteById(id), ApiResponseConstants.GET_DATA_SUCCESS));
    }
}
