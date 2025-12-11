package com.ashu.Ecommerce.entity;

//Importing JPA annotations like @ID, @Column used for mapping class to a db structure.
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

//This class from java Time API > represents the timestamp in UTC.
import java.time.Instant;

/*create base class that contains common fields, but this class should not become table in the database.
* it does not get its own table the BaseEntity.*/
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @CreatedDate
    @Column(nullable = false,updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(nullable = true)
    private Instant updateAt;

    //This method automatically  called before the entity is saved for the first time.
    @PrePersist
    public void onCreate(){
        Instant now = Instant.now();
        this.createdAt = now;
        this.updateAt = now;
    }
    @PreUpdate
    public void onUpdate(){
        this.updateAt = Instant.now();
    }
}
