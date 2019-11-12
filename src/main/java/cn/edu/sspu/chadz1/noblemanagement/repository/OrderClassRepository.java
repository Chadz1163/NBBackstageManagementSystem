package cn.edu.sspu.chadz1.noblemanagement.repository;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.OrderClassVO;
import cn.edu.sspu.chadz1.noblemanagement.entity.OrderclassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/09
 * @Description:
 */
@Repository
public interface OrderClassRepository extends JpaRepository<OrderclassEntity, Integer> {
    @Query(value = "SELECT o FROM OrderclassEntity o WHERE o.orderClass LIKE %:#{#orderClassVO.orderClass}% " +
            "AND o.orderName LIKE %:#{#orderClassVO.orderName}% AND o.orderTime LIKE %:#{#orderClassVO.orderTime}%")
    List<OrderclassEntity> findBy(@Param("orderClassVO") OrderClassVO orderClassVO);
}
