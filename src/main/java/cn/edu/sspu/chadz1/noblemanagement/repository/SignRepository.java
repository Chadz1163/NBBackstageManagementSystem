package cn.edu.sspu.chadz1.noblemanagement.repository;

import cn.edu.sspu.chadz1.noblemanagement.VO.response.SignResponseVO;
import cn.edu.sspu.chadz1.noblemanagement.entity.SignrecordsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/12
 * @Description:
 */
@Repository
public interface SignRepository extends JpaRepository<SignrecordsEntity, Integer> {

}
