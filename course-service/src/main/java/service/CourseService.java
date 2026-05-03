package service;

import entity.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reporsitory.CourseRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
