<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${BasePackageName}${DaoPackageName}.${ClassName}Dao">

    <resultMap id="${EntityName}ResultMap" type="${BasePackageName}${EntityPackageName}.${ClassName}">
        ${ResultMap}
        ${Association}
        ${Collection}
    </resultMap>

    <sql id="${EntityName}Columns">
        ${ColumnMap}
    </sql>

    <sql id="${EntityName}Joins">
        ${Joins}
    </sql>

    <select id="selectByCondition" resultMap="${EntityName}ResultMap">
        SELECT
        <include refid="${EntityName}Columns" />
        FROM ${TableName} <include refid="${EntityName}Joins" />
        <where>
        ${whereCondition}
        </where>
    </select>

    <insert id="insert">
        INSERT INTO ${TableName}
            ${InsertProperties}
            ${InsertValues}
    </insert>

    <insert id="insertBatch">
        INSERT INTO ${TableName}(
            ${InsertProperties}
        )
        VALUES
        <foreach collection ="list" item="${EntityName}" separator =",">
        (
            ${InsertBatchValues}
        )
        </foreach>
    </insert>

    <update id="update">
        UPDATE ${TableName}
        <set>
        ${UpdateProperties}
        </set>
        WHERE ${PrimaryKey} = ${WhereId}
    </update>

    <update id="delete">
        DELETE FROM ${TableName}
        WHERE ${PrimaryKey} = ${WhereId}
    </update>

</mapper>
