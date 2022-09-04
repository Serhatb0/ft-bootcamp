package com.biricik.ftBootcamp.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.biricik.ftBootcamp.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

	/**
	 * Lists comments for a productId
	 * 
	 * @param productId
	 * @return List<Comment>
	 */

	List<Comment> findByProductId(int productId);

	/**
	 * Lists comments made to a particular product in the given date ranges
	 * 
	 * @param productId
	 * @param startDate
	 * @param endDate
	 * @return List<Comment>
	 */
	@Query(nativeQuery = true, value = "SELECT * FROM COMMENTS WHERE PRODUCT_ID = :productId AND CREATED_DATE BETWEEN :startDate AND :endDate")
	List<Comment> findByProductIdAndstartDateBetweenEndDate(@Param("productId") int productId,
			@Param("startDate") Date startDate, @Param("endDate") Date endDate);

	/**
	 * Lists comments for a userId
	 * 
	 * @param userId
	 * @return List<Comment>
	 */
	List<Comment> findByUserId(int userId);

	/**
	 * Lists comments made to a particular user in the given date ranges
	 * 
	 * @param productId
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	@Query(nativeQuery = true, value = "SELECT * FROM COMMENTS WHERE USER_ID = :userId AND CREATED_DATE BETWEEN :startDate AND :endDate")
	List<Comment> findByUserIdAndstartDateBetweenEndDate(@Param("userId") int productId,
			@Param("startDate") Date startDate, @Param("endDate") Date endDate);

}
