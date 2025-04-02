package com.skynetix.library.controller; // Ensure this matches your package structure

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")  // ✅ Ensures proper endpoint mapping
public class LibraryEventsController {

    @PostMapping("/libraryEvent")  // ✅ Matches the correct path
    public ResponseEntity<String> postLibraryEvent(@RequestBody String libraryEvent) {
        System.out.println("Received event: " + libraryEvent);
        return ResponseEntity.status(HttpStatus.CREATED).body("Event received");
    }
}
