package com.biricik.ftBootcamp.bootstrap;

import java.util.Date;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import com.biricik.ftBootcamp.entities.Comment;
import com.biricik.ftBootcamp.entities.Product;
import com.biricik.ftBootcamp.entities.User;
import com.biricik.ftBootcamp.repositories.CommentRepository;
import com.biricik.ftBootcamp.repositories.ProductRepository;
import com.biricik.ftBootcamp.repositories.UserRepository;
import com.github.javafaker.Faker;

@Component
public class BootStrapData implements CommandLineRunner {

	private final Faker faker;
	private final ProductRepository productRepository;
	private final UserRepository userRepository;
	private final CommentRepository commentRepository;

	public BootStrapData(Faker faker, ProductRepository productRepository, UserRepository userRepository,
			CommentRepository commentRepository) {
		this.faker = faker;
		this.productRepository = productRepository;
		this.userRepository = userRepository;
		this.commentRepository = commentRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		for (int i = 1; i <= 20; i++) {
			User user = new User();
			user.setFirstName(faker.name().firstName());
			user.setLastName(faker.name().lastName());
			user.setEmail(faker.internet().emailAddress());
			user.setPhoneNumber(faker.phoneNumber().cellPhone());
			userRepository.save(user);

		}

		for (int i = 1; i <= 20; i++) {
			Product product = new Product();
			product.setProductName(faker.commerce().productName());
			product.setPrice(Double.parseDouble((faker.commerce().price())));

			if (i % 2 == 0) {
				product.setExpirationDate(new Date("2020/5/6"));
			} else if (i % 5 == 0) {
				product.setExpirationDate(null);
			} else {
				product.setExpirationDate(new Date("2023/5/6"));
			}

			productRepository.save(product);
		}

		for (int i = 1; i <= 20; i++) {
			Comment comment = new Comment();
			comment.setComment("Comment: " + i);

			Optional<Product> optionalProduct = productRepository.findById(i);
			comment.setProduct(optionalProduct.get());

			Optional<User> user = userRepository.findById(i);
			comment.setUser(user.get());

			commentRepository.save(comment);

		}
		
		
	}

}
