package org.csu.sinojapaneseexchange.persistence;

import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.csu.sinojapaneseexchange.domain.WordInfo;
import org.csu.sinojapaneseexchange.domain.WordInfoExample;

public interface WordInfoMapper {
    @SelectProvider(type=WordInfoSqlProvider.class, method="countByExample")
    int countByExample(WordInfoExample example);

    @DeleteProvider(type=WordInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(WordInfoExample example);

    @Delete({
        "delete from tb_data",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into tb_data (id, fragment, ",
        "word_zh, word_ja, ",
        "roma, sen_zh1, sen_ja1, ",
        "sen_zh2, sen_ja2, ",
        "sen_zh3, sen_ja3, ",
        "imgUrl)",
        "values (#{id,jdbcType=INTEGER}, #{fragment,jdbcType=INTEGER}, ",
        "#{wordZh,jdbcType=VARCHAR}, #{wordJa,jdbcType=VARCHAR}, ",
        "#{roma,jdbcType=VARCHAR}, #{senZh1,jdbcType=VARCHAR}, #{senJa1,jdbcType=VARCHAR}, ",
        "#{senZh2,jdbcType=VARCHAR}, #{senJa2,jdbcType=VARCHAR}, ",
        "#{senZh3,jdbcType=VARCHAR}, #{senJa3,jdbcType=VARCHAR}, ",
        "#{imgurl,jdbcType=VARCHAR})"
    })
    int insert(WordInfo record);

    @InsertProvider(type=WordInfoSqlProvider.class, method="insertSelective")
    int insertSelective(WordInfo record);

    @SelectProvider(type=WordInfoSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="fragment", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="word_zh", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="word_ja", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="roma", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_zh1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_ja1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_zh2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_ja2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_zh3", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_ja3", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="imgUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<WordInfo> selectByExample(WordInfoExample example);

    @Select({
        "select",
        "id, fragment, word_zh, word_ja, roma, sen_zh1, sen_ja1, sen_zh2, sen_ja2, sen_zh3, ",
        "sen_ja3, imgUrl",
        "from tb_data",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="fragment", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="word_zh", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="word_ja", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="roma", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_zh1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_ja1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_zh2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_ja2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_zh3", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sen_ja3", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="imgUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    WordInfo selectByPrimaryKey(Integer id);

    @UpdateProvider(type=WordInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") WordInfo record, @Param("example") WordInfoExample example);

    @UpdateProvider(type=WordInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") WordInfo record, @Param("example") WordInfoExample example);

    @UpdateProvider(type=WordInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(WordInfo record);

    @Update({
        "update tb_data",
        "set fragment = #{fragment,jdbcType=INTEGER},",
          "word_zh = #{wordZh,jdbcType=VARCHAR},",
          "word_ja = #{wordJa,jdbcType=VARCHAR},",
          "roma = #{roma,jdbcType=VARCHAR},",
          "sen_zh1 = #{senZh1,jdbcType=VARCHAR},",
          "sen_ja1 = #{senJa1,jdbcType=VARCHAR},",
          "sen_zh2 = #{senZh2,jdbcType=VARCHAR},",
          "sen_ja2 = #{senJa2,jdbcType=VARCHAR},",
          "sen_zh3 = #{senZh3,jdbcType=VARCHAR},",
          "sen_ja3 = #{senJa3,jdbcType=VARCHAR},",
          "imgUrl = #{imgurl,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(WordInfo record);
}