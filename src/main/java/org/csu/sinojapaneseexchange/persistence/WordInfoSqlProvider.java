package org.csu.sinojapaneseexchange.persistence;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;
import org.csu.sinojapaneseexchange.domain.WordInfo;
import org.csu.sinojapaneseexchange.domain.WordInfoExample.Criteria;
import org.csu.sinojapaneseexchange.domain.WordInfoExample.Criterion;
import org.csu.sinojapaneseexchange.domain.WordInfoExample;

public class WordInfoSqlProvider {

    public String countByExample(WordInfoExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("tb_data");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(WordInfoExample example) {
        BEGIN();
        DELETE_FROM("tb_data");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(WordInfo record) {
        BEGIN();
        INSERT_INTO("tb_data");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getFragment() != null) {
            VALUES("fragment", "#{fragment,jdbcType=INTEGER}");
        }
        
        if (record.getWordZh() != null) {
            VALUES("word_zh", "#{wordZh,jdbcType=VARCHAR}");
        }
        
        if (record.getWordJa() != null) {
            VALUES("word_ja", "#{wordJa,jdbcType=VARCHAR}");
        }
        
        if (record.getRoma() != null) {
            VALUES("roma", "#{roma,jdbcType=VARCHAR}");
        }
        
        if (record.getSenZh1() != null) {
            VALUES("sen_zh1", "#{senZh1,jdbcType=VARCHAR}");
        }
        
        if (record.getSenJa1() != null) {
            VALUES("sen_ja1", "#{senJa1,jdbcType=VARCHAR}");
        }
        
        if (record.getSenZh2() != null) {
            VALUES("sen_zh2", "#{senZh2,jdbcType=VARCHAR}");
        }
        
        if (record.getSenJa2() != null) {
            VALUES("sen_ja2", "#{senJa2,jdbcType=VARCHAR}");
        }
        
        if (record.getSenZh3() != null) {
            VALUES("sen_zh3", "#{senZh3,jdbcType=VARCHAR}");
        }
        
        if (record.getSenJa3() != null) {
            VALUES("sen_ja3", "#{senJa3,jdbcType=VARCHAR}");
        }
        
        if (record.getImgurl() != null) {
            VALUES("imgUrl", "#{imgurl,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(WordInfoExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("fragment");
        SELECT("word_zh");
        SELECT("word_ja");
        SELECT("roma");
        SELECT("sen_zh1");
        SELECT("sen_ja1");
        SELECT("sen_zh2");
        SELECT("sen_ja2");
        SELECT("sen_zh3");
        SELECT("sen_ja3");
        SELECT("imgUrl");
        FROM("tb_data");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        WordInfo record = (WordInfo) parameter.get("record");
        WordInfoExample example = (WordInfoExample) parameter.get("example");
        
        BEGIN();
        UPDATE("tb_data");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getFragment() != null) {
            SET("fragment = #{record.fragment,jdbcType=INTEGER}");
        }
        
        if (record.getWordZh() != null) {
            SET("word_zh = #{record.wordZh,jdbcType=VARCHAR}");
        }
        
        if (record.getWordJa() != null) {
            SET("word_ja = #{record.wordJa,jdbcType=VARCHAR}");
        }
        
        if (record.getRoma() != null) {
            SET("roma = #{record.roma,jdbcType=VARCHAR}");
        }
        
        if (record.getSenZh1() != null) {
            SET("sen_zh1 = #{record.senZh1,jdbcType=VARCHAR}");
        }
        
        if (record.getSenJa1() != null) {
            SET("sen_ja1 = #{record.senJa1,jdbcType=VARCHAR}");
        }
        
        if (record.getSenZh2() != null) {
            SET("sen_zh2 = #{record.senZh2,jdbcType=VARCHAR}");
        }
        
        if (record.getSenJa2() != null) {
            SET("sen_ja2 = #{record.senJa2,jdbcType=VARCHAR}");
        }
        
        if (record.getSenZh3() != null) {
            SET("sen_zh3 = #{record.senZh3,jdbcType=VARCHAR}");
        }
        
        if (record.getSenJa3() != null) {
            SET("sen_ja3 = #{record.senJa3,jdbcType=VARCHAR}");
        }
        
        if (record.getImgurl() != null) {
            SET("imgUrl = #{record.imgurl,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("tb_data");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("fragment = #{record.fragment,jdbcType=INTEGER}");
        SET("word_zh = #{record.wordZh,jdbcType=VARCHAR}");
        SET("word_ja = #{record.wordJa,jdbcType=VARCHAR}");
        SET("roma = #{record.roma,jdbcType=VARCHAR}");
        SET("sen_zh1 = #{record.senZh1,jdbcType=VARCHAR}");
        SET("sen_ja1 = #{record.senJa1,jdbcType=VARCHAR}");
        SET("sen_zh2 = #{record.senZh2,jdbcType=VARCHAR}");
        SET("sen_ja2 = #{record.senJa2,jdbcType=VARCHAR}");
        SET("sen_zh3 = #{record.senZh3,jdbcType=VARCHAR}");
        SET("sen_ja3 = #{record.senJa3,jdbcType=VARCHAR}");
        SET("imgUrl = #{record.imgurl,jdbcType=VARCHAR}");
        
        WordInfoExample example = (WordInfoExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(WordInfo record) {
        BEGIN();
        UPDATE("tb_data");
        
        if (record.getFragment() != null) {
            SET("fragment = #{fragment,jdbcType=INTEGER}");
        }
        
        if (record.getWordZh() != null) {
            SET("word_zh = #{wordZh,jdbcType=VARCHAR}");
        }
        
        if (record.getWordJa() != null) {
            SET("word_ja = #{wordJa,jdbcType=VARCHAR}");
        }
        
        if (record.getRoma() != null) {
            SET("roma = #{roma,jdbcType=VARCHAR}");
        }
        
        if (record.getSenZh1() != null) {
            SET("sen_zh1 = #{senZh1,jdbcType=VARCHAR}");
        }
        
        if (record.getSenJa1() != null) {
            SET("sen_ja1 = #{senJa1,jdbcType=VARCHAR}");
        }
        
        if (record.getSenZh2() != null) {
            SET("sen_zh2 = #{senZh2,jdbcType=VARCHAR}");
        }
        
        if (record.getSenJa2() != null) {
            SET("sen_ja2 = #{senJa2,jdbcType=VARCHAR}");
        }
        
        if (record.getSenZh3() != null) {
            SET("sen_zh3 = #{senZh3,jdbcType=VARCHAR}");
        }
        
        if (record.getSenJa3() != null) {
            SET("sen_ja3 = #{senJa3,jdbcType=VARCHAR}");
        }
        
        if (record.getImgurl() != null) {
            SET("imgUrl = #{imgurl,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(WordInfoExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}