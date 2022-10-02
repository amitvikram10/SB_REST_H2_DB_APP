package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Product;
//pkey as a integer type
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
