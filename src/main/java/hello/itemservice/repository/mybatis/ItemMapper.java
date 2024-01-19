package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper // @Mapper: Mybatis에서 인식하기 위해 필요
public interface ItemMapper {

    void save(Item item);

    void update(@Param("id") Long id, @Param("updateParam")ItemUpdateDto updateParam); // @Param : myBatis에서 다수 파라미터 전달 시 반드시 필요

    Optional<Item> findById(Long id);

    List<Item> findAll(ItemSearchCond itemSearch);
}
