package com.example.demo;

import com.example.dto.UserDO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Random;

@RestController
public class RestControllerClass {

    @ApiOperation(value = "User registration", notes = "The service provides the functionality to create a user object.")
    @ApiResponses({
            @ApiResponse(code = 201, message = "User created", response = UserDO.class, responseHeaders = @ResponseHeader(name = "Location")),
            @ApiResponse(code = 400, message = "Invalid parameters"),
            @ApiResponse(code = 409, message = "User already exists"),
            @ApiResponse(code = 422, message = "Unprocessable entity"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @RequestMapping(value="/user/{name}", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity getAllUsers(@ApiParam(value = "The unique identifier (name) of the user which should be created", required = true) @PathVariable("name") String name) {

        UserDO user = new UserDO();
        user.setUsername("usr" + new Random().nextInt(100));
        user.setName(name != null ? name : "");
        user.dsetDateOfBirth(new Date());
        return ResponseEntity.ok(user);

    }
}
