package org.csu.sinojapaneseexchange.domain;

import java.util.ArrayList;
import java.util.List;

public class WordInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WordInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFragmentIsNull() {
            addCriterion("fragment is null");
            return (Criteria) this;
        }

        public Criteria andFragmentIsNotNull() {
            addCriterion("fragment is not null");
            return (Criteria) this;
        }

        public Criteria andFragmentEqualTo(Integer value) {
            addCriterion("fragment =", value, "fragment");
            return (Criteria) this;
        }

        public Criteria andFragmentNotEqualTo(Integer value) {
            addCriterion("fragment <>", value, "fragment");
            return (Criteria) this;
        }

        public Criteria andFragmentGreaterThan(Integer value) {
            addCriterion("fragment >", value, "fragment");
            return (Criteria) this;
        }

        public Criteria andFragmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("fragment >=", value, "fragment");
            return (Criteria) this;
        }

        public Criteria andFragmentLessThan(Integer value) {
            addCriterion("fragment <", value, "fragment");
            return (Criteria) this;
        }

        public Criteria andFragmentLessThanOrEqualTo(Integer value) {
            addCriterion("fragment <=", value, "fragment");
            return (Criteria) this;
        }

        public Criteria andFragmentIn(List<Integer> values) {
            addCriterion("fragment in", values, "fragment");
            return (Criteria) this;
        }

        public Criteria andFragmentNotIn(List<Integer> values) {
            addCriterion("fragment not in", values, "fragment");
            return (Criteria) this;
        }

        public Criteria andFragmentBetween(Integer value1, Integer value2) {
            addCriterion("fragment between", value1, value2, "fragment");
            return (Criteria) this;
        }

        public Criteria andFragmentNotBetween(Integer value1, Integer value2) {
            addCriterion("fragment not between", value1, value2, "fragment");
            return (Criteria) this;
        }

        public Criteria andWordZhIsNull() {
            addCriterion("word_zh is null");
            return (Criteria) this;
        }

        public Criteria andWordZhIsNotNull() {
            addCriterion("word_zh is not null");
            return (Criteria) this;
        }

        public Criteria andWordZhEqualTo(String value) {
            addCriterion("word_zh =", value, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordZhNotEqualTo(String value) {
            addCriterion("word_zh <>", value, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordZhGreaterThan(String value) {
            addCriterion("word_zh >", value, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordZhGreaterThanOrEqualTo(String value) {
            addCriterion("word_zh >=", value, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordZhLessThan(String value) {
            addCriterion("word_zh <", value, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordZhLessThanOrEqualTo(String value) {
            addCriterion("word_zh <=", value, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordZhLike(String value) {
            addCriterion("word_zh like", value, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordZhNotLike(String value) {
            addCriterion("word_zh not like", value, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordZhIn(List<String> values) {
            addCriterion("word_zh in", values, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordZhNotIn(List<String> values) {
            addCriterion("word_zh not in", values, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordZhBetween(String value1, String value2) {
            addCriterion("word_zh between", value1, value2, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordZhNotBetween(String value1, String value2) {
            addCriterion("word_zh not between", value1, value2, "wordZh");
            return (Criteria) this;
        }

        public Criteria andWordJaIsNull() {
            addCriterion("word_ja is null");
            return (Criteria) this;
        }

        public Criteria andWordJaIsNotNull() {
            addCriterion("word_ja is not null");
            return (Criteria) this;
        }

        public Criteria andWordJaEqualTo(String value) {
            addCriterion("word_ja =", value, "wordJa");
            return (Criteria) this;
        }

        public Criteria andWordJaNotEqualTo(String value) {
            addCriterion("word_ja <>", value, "wordJa");
            return (Criteria) this;
        }

        public Criteria andWordJaGreaterThan(String value) {
            addCriterion("word_ja >", value, "wordJa");
            return (Criteria) this;
        }

        public Criteria andWordJaGreaterThanOrEqualTo(String value) {
            addCriterion("word_ja >=", value, "wordJa");
            return (Criteria) this;
        }

        public Criteria andWordJaLessThan(String value) {
            addCriterion("word_ja <", value, "wordJa");
            return (Criteria) this;
        }

        public Criteria andWordJaLessThanOrEqualTo(String value) {
            addCriterion("word_ja <=", value, "wordJa");
            return (Criteria) this;
        }

        public Criteria andWordJaLike(String value) {
            addCriterion("word_ja like", value, "wordJa");
            return (Criteria) this;
        }

        public Criteria andWordJaNotLike(String value) {
            addCriterion("word_ja not like", value, "wordJa");
            return (Criteria) this;
        }

        public Criteria andWordJaIn(List<String> values) {
            addCriterion("word_ja in", values, "wordJa");
            return (Criteria) this;
        }

        public Criteria andWordJaNotIn(List<String> values) {
            addCriterion("word_ja not in", values, "wordJa");
            return (Criteria) this;
        }

        public Criteria andWordJaBetween(String value1, String value2) {
            addCriterion("word_ja between", value1, value2, "wordJa");
            return (Criteria) this;
        }

        public Criteria andWordJaNotBetween(String value1, String value2) {
            addCriterion("word_ja not between", value1, value2, "wordJa");
            return (Criteria) this;
        }

        public Criteria andRomaIsNull() {
            addCriterion("roma is null");
            return (Criteria) this;
        }

        public Criteria andRomaIsNotNull() {
            addCriterion("roma is not null");
            return (Criteria) this;
        }

        public Criteria andRomaEqualTo(String value) {
            addCriterion("roma =", value, "roma");
            return (Criteria) this;
        }

        public Criteria andRomaNotEqualTo(String value) {
            addCriterion("roma <>", value, "roma");
            return (Criteria) this;
        }

        public Criteria andRomaGreaterThan(String value) {
            addCriterion("roma >", value, "roma");
            return (Criteria) this;
        }

        public Criteria andRomaGreaterThanOrEqualTo(String value) {
            addCriterion("roma >=", value, "roma");
            return (Criteria) this;
        }

        public Criteria andRomaLessThan(String value) {
            addCriterion("roma <", value, "roma");
            return (Criteria) this;
        }

        public Criteria andRomaLessThanOrEqualTo(String value) {
            addCriterion("roma <=", value, "roma");
            return (Criteria) this;
        }

        public Criteria andRomaLike(String value) {
            addCriterion("roma like", value, "roma");
            return (Criteria) this;
        }

        public Criteria andRomaNotLike(String value) {
            addCriterion("roma not like", value, "roma");
            return (Criteria) this;
        }

        public Criteria andRomaIn(List<String> values) {
            addCriterion("roma in", values, "roma");
            return (Criteria) this;
        }

        public Criteria andRomaNotIn(List<String> values) {
            addCriterion("roma not in", values, "roma");
            return (Criteria) this;
        }

        public Criteria andRomaBetween(String value1, String value2) {
            addCriterion("roma between", value1, value2, "roma");
            return (Criteria) this;
        }

        public Criteria andRomaNotBetween(String value1, String value2) {
            addCriterion("roma not between", value1, value2, "roma");
            return (Criteria) this;
        }

        public Criteria andSenZh1IsNull() {
            addCriterion("sen_zh1 is null");
            return (Criteria) this;
        }

        public Criteria andSenZh1IsNotNull() {
            addCriterion("sen_zh1 is not null");
            return (Criteria) this;
        }

        public Criteria andSenZh1EqualTo(String value) {
            addCriterion("sen_zh1 =", value, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenZh1NotEqualTo(String value) {
            addCriterion("sen_zh1 <>", value, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenZh1GreaterThan(String value) {
            addCriterion("sen_zh1 >", value, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenZh1GreaterThanOrEqualTo(String value) {
            addCriterion("sen_zh1 >=", value, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenZh1LessThan(String value) {
            addCriterion("sen_zh1 <", value, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenZh1LessThanOrEqualTo(String value) {
            addCriterion("sen_zh1 <=", value, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenZh1Like(String value) {
            addCriterion("sen_zh1 like", value, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenZh1NotLike(String value) {
            addCriterion("sen_zh1 not like", value, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenZh1In(List<String> values) {
            addCriterion("sen_zh1 in", values, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenZh1NotIn(List<String> values) {
            addCriterion("sen_zh1 not in", values, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenZh1Between(String value1, String value2) {
            addCriterion("sen_zh1 between", value1, value2, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenZh1NotBetween(String value1, String value2) {
            addCriterion("sen_zh1 not between", value1, value2, "senZh1");
            return (Criteria) this;
        }

        public Criteria andSenJa1IsNull() {
            addCriterion("sen_ja1 is null");
            return (Criteria) this;
        }

        public Criteria andSenJa1IsNotNull() {
            addCriterion("sen_ja1 is not null");
            return (Criteria) this;
        }

        public Criteria andSenJa1EqualTo(String value) {
            addCriterion("sen_ja1 =", value, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenJa1NotEqualTo(String value) {
            addCriterion("sen_ja1 <>", value, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenJa1GreaterThan(String value) {
            addCriterion("sen_ja1 >", value, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenJa1GreaterThanOrEqualTo(String value) {
            addCriterion("sen_ja1 >=", value, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenJa1LessThan(String value) {
            addCriterion("sen_ja1 <", value, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenJa1LessThanOrEqualTo(String value) {
            addCriterion("sen_ja1 <=", value, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenJa1Like(String value) {
            addCriterion("sen_ja1 like", value, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenJa1NotLike(String value) {
            addCriterion("sen_ja1 not like", value, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenJa1In(List<String> values) {
            addCriterion("sen_ja1 in", values, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenJa1NotIn(List<String> values) {
            addCriterion("sen_ja1 not in", values, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenJa1Between(String value1, String value2) {
            addCriterion("sen_ja1 between", value1, value2, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenJa1NotBetween(String value1, String value2) {
            addCriterion("sen_ja1 not between", value1, value2, "senJa1");
            return (Criteria) this;
        }

        public Criteria andSenZh2IsNull() {
            addCriterion("sen_zh2 is null");
            return (Criteria) this;
        }

        public Criteria andSenZh2IsNotNull() {
            addCriterion("sen_zh2 is not null");
            return (Criteria) this;
        }

        public Criteria andSenZh2EqualTo(String value) {
            addCriterion("sen_zh2 =", value, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenZh2NotEqualTo(String value) {
            addCriterion("sen_zh2 <>", value, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenZh2GreaterThan(String value) {
            addCriterion("sen_zh2 >", value, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenZh2GreaterThanOrEqualTo(String value) {
            addCriterion("sen_zh2 >=", value, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenZh2LessThan(String value) {
            addCriterion("sen_zh2 <", value, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenZh2LessThanOrEqualTo(String value) {
            addCriterion("sen_zh2 <=", value, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenZh2Like(String value) {
            addCriterion("sen_zh2 like", value, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenZh2NotLike(String value) {
            addCriterion("sen_zh2 not like", value, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenZh2In(List<String> values) {
            addCriterion("sen_zh2 in", values, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenZh2NotIn(List<String> values) {
            addCriterion("sen_zh2 not in", values, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenZh2Between(String value1, String value2) {
            addCriterion("sen_zh2 between", value1, value2, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenZh2NotBetween(String value1, String value2) {
            addCriterion("sen_zh2 not between", value1, value2, "senZh2");
            return (Criteria) this;
        }

        public Criteria andSenJa2IsNull() {
            addCriterion("sen_ja2 is null");
            return (Criteria) this;
        }

        public Criteria andSenJa2IsNotNull() {
            addCriterion("sen_ja2 is not null");
            return (Criteria) this;
        }

        public Criteria andSenJa2EqualTo(String value) {
            addCriterion("sen_ja2 =", value, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenJa2NotEqualTo(String value) {
            addCriterion("sen_ja2 <>", value, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenJa2GreaterThan(String value) {
            addCriterion("sen_ja2 >", value, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenJa2GreaterThanOrEqualTo(String value) {
            addCriterion("sen_ja2 >=", value, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenJa2LessThan(String value) {
            addCriterion("sen_ja2 <", value, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenJa2LessThanOrEqualTo(String value) {
            addCriterion("sen_ja2 <=", value, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenJa2Like(String value) {
            addCriterion("sen_ja2 like", value, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenJa2NotLike(String value) {
            addCriterion("sen_ja2 not like", value, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenJa2In(List<String> values) {
            addCriterion("sen_ja2 in", values, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenJa2NotIn(List<String> values) {
            addCriterion("sen_ja2 not in", values, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenJa2Between(String value1, String value2) {
            addCriterion("sen_ja2 between", value1, value2, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenJa2NotBetween(String value1, String value2) {
            addCriterion("sen_ja2 not between", value1, value2, "senJa2");
            return (Criteria) this;
        }

        public Criteria andSenZh3IsNull() {
            addCriterion("sen_zh3 is null");
            return (Criteria) this;
        }

        public Criteria andSenZh3IsNotNull() {
            addCriterion("sen_zh3 is not null");
            return (Criteria) this;
        }

        public Criteria andSenZh3EqualTo(String value) {
            addCriterion("sen_zh3 =", value, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenZh3NotEqualTo(String value) {
            addCriterion("sen_zh3 <>", value, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenZh3GreaterThan(String value) {
            addCriterion("sen_zh3 >", value, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenZh3GreaterThanOrEqualTo(String value) {
            addCriterion("sen_zh3 >=", value, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenZh3LessThan(String value) {
            addCriterion("sen_zh3 <", value, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenZh3LessThanOrEqualTo(String value) {
            addCriterion("sen_zh3 <=", value, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenZh3Like(String value) {
            addCriterion("sen_zh3 like", value, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenZh3NotLike(String value) {
            addCriterion("sen_zh3 not like", value, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenZh3In(List<String> values) {
            addCriterion("sen_zh3 in", values, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenZh3NotIn(List<String> values) {
            addCriterion("sen_zh3 not in", values, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenZh3Between(String value1, String value2) {
            addCriterion("sen_zh3 between", value1, value2, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenZh3NotBetween(String value1, String value2) {
            addCriterion("sen_zh3 not between", value1, value2, "senZh3");
            return (Criteria) this;
        }

        public Criteria andSenJa3IsNull() {
            addCriterion("sen_ja3 is null");
            return (Criteria) this;
        }

        public Criteria andSenJa3IsNotNull() {
            addCriterion("sen_ja3 is not null");
            return (Criteria) this;
        }

        public Criteria andSenJa3EqualTo(String value) {
            addCriterion("sen_ja3 =", value, "senJa3");
            return (Criteria) this;
        }

        public Criteria andSenJa3NotEqualTo(String value) {
            addCriterion("sen_ja3 <>", value, "senJa3");
            return (Criteria) this;
        }

        public Criteria andSenJa3GreaterThan(String value) {
            addCriterion("sen_ja3 >", value, "senJa3");
            return (Criteria) this;
        }

        public Criteria andSenJa3GreaterThanOrEqualTo(String value) {
            addCriterion("sen_ja3 >=", value, "senJa3");
            return (Criteria) this;
        }

        public Criteria andSenJa3LessThan(String value) {
            addCriterion("sen_ja3 <", value, "senJa3");
            return (Criteria) this;
        }

        public Criteria andSenJa3LessThanOrEqualTo(String value) {
            addCriterion("sen_ja3 <=", value, "senJa3");
            return (Criteria) this;
        }

        public Criteria andSenJa3Like(String value) {
            addCriterion("sen_ja3 like", value, "senJa3");
            return (Criteria) this;
        }

        public Criteria andSenJa3NotLike(String value) {
            addCriterion("sen_ja3 not like", value, "senJa3");
            return (Criteria) this;
        }

        public Criteria andSenJa3In(List<String> values) {
            addCriterion("sen_ja3 in", values, "senJa3");
            return (Criteria) this;
        }

        public Criteria andSenJa3NotIn(List<String> values) {
            addCriterion("sen_ja3 not in", values, "senJa3");
            return (Criteria) this;
        }

        public Criteria andSenJa3Between(String value1, String value2) {
            addCriterion("sen_ja3 between", value1, value2, "senJa3");
            return (Criteria) this;
        }

        public Criteria andSenJa3NotBetween(String value1, String value2) {
            addCriterion("sen_ja3 not between", value1, value2, "senJa3");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgUrl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgUrl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgUrl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgUrl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgUrl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgUrl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgUrl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgUrl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgUrl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgUrl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgUrl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgUrl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}