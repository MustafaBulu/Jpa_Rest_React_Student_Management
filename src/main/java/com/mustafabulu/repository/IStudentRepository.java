package com.mustafabulu.repository;

import com.mustafabulu.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<StudentEntity,Long> {
    //JpaRepository CrudRepository gibi crud işlemlerini yapabilmemizi sağlıyor. Ayrıca bazı işlevsellikler ekliyor.
}
