package ncpsb.datascience.dpeng.mybatis.helloworld.mapper;

import ncpsb.datascience.dpeng.common.model.mybatis.helloworld.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @author dpeng
 */
public interface EmployeeMapper {

    /**
     * asd
     * @param id
     * @return
     */
    Employee selectEmployee(Integer id);


    /**
     *
     * @param id
     * @param lastName
     * @return
     */
    Employee selectEmployeeWithParam(Integer id, @Param("lastName") String lastName);

}
