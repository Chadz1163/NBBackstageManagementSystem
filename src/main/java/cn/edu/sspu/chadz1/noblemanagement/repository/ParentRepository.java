package cn.edu.sspu.chadz1.noblemanagement.repository;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.ParentVO;
import cn.edu.sspu.chadz1.noblemanagement.entity.ParentEntity;
import javafx.scene.Parent;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/07
 * @Description:
 */
@Repository
public interface ParentRepository extends JpaRepository<ParentEntity, Integer> {

    @Query(value = "select o from ParentEntity o where o.childCode like %:#{#parentVO.childCode}% and o.childName like %:#{#parentVO.childName}% and o.parentName like %:#{#parentVO.parentName}% and o.userId like %:#{#parentVO.userID}%")
    List<ParentEntity> findBy(@Param("parentVO") ParentVO parentVO, Pageable pageable);

}
