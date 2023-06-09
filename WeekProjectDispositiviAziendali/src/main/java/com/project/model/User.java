package com.project.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.List;
import java.util.Set;



@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String lastName;
    @Column(nullable = false, unique = true)
	private String email;
    @OneToMany
    private List<Device> device;

}
