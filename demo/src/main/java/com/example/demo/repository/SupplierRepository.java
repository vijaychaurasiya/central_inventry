package com.example.demo.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Supplier;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Integer> {
  
	@Query("select s from Supplier s where s.email= :email and s.password= :password")
	public Supplier findByUserName(@Param("email") String email, @Param("password") String password);

//	@Modifying
//	@Query("INSERT INTO Supplier (firstName, lastName, baseUrl, consumerKey, consumerSecret, phone, email, password) " +
//	       "VALUES (:firstName, :lastName, :baseUrl, :consumerKey, :consumerSecret, :phone, :email, :password)")
//	void saveSupplier(
//	    @Param("firstName") String firstName,
//	    @Param("lastName") String lastName,
//	    @Param("baseUrl") String baseUrl,
//	    @Param("consumerKey") String consumerKey,
//	    @Param("consumerSecret") String consumerSecret,
//	    @Param("phone") Integer phone,
//	    @Param("email") String email,
//	    @Param("password") String password
//	);
//	
}
