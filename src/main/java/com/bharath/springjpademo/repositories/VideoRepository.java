package com.bharath.springjpademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bharath.springjpademo.models.Video;
public interface VideoRepository extends JpaRepository<Video,Integer> {
}
