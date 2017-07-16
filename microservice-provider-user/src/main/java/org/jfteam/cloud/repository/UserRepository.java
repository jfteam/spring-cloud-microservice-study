package org.jfteam.cloud.repository;

import org.jfteam.cloud.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: fengwenping
 * Date: 2017-07-10
 * Time: 下午11:29
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
