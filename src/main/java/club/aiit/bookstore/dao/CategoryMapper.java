package club.aiit.bookstore.dao;

import club.aiit.bookstore.entity.Category;
import club.aiit.bookstore.util.PageUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
    Integer insertOne(@Param("category") Category category);
    Integer updateOne(@Param("category") Category category);
    Integer delete(@Param("category_id_list")Integer[] category_id_list);
    List<Category> select(@Param("category_name") String category_name, @Param("pageUtil") PageUtil pageUtil);
    Category selectOne(@Param("category_id") Integer category_id);
    Integer selectTotal(@Param("category_name") String category_name);
}