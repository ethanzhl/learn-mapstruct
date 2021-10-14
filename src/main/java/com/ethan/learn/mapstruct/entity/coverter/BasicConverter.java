package com.ethan.learn.mapstruct.entity.coverter;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.stream.Stream;

/**
 * MapStruct 通用接口
 *
 * @author ethan
 * @date 2021/10/13 2:31 下午
 */
public interface BasicConverter<SOURCE, TARGET> {
    /**
     * 来源对象 -> 目标对象
     *
     * @param source 来源对象
     * @return 目标对象
     */
    TARGET to(SOURCE source);

    /**
     * 来源对象集合 -> 目标对象集合
     *
     * @param sources 来源对象集合
     * @return 目标对象集合
     */
    List<TARGET> to(List<SOURCE> sources);

    /**
     * 来源流对象 -> 目标对象集合
     *
     * @param sourceStream 来源流对象
     * @return 目标对象集合
     */
    List<TARGET> to(Stream<SOURCE> sourceStream);

    /**
     * 更新目标对象
     *
     * @param source 来源对象
     * @param target 目标对象
     */
    void update(SOURCE source, @MappingTarget TARGET target);

    /**
     * 更新目标对象集合
     *
     * @param sources 来源对象集合
     * @param targets 目标对象集合
     */
    void update(List<SOURCE> sources, @MappingTarget List<TARGET> targets);

    /**
     * 目标对象 -> 来源对象
     *
     * @param target 目标对象
     * @return 来源对象
     */
    @InheritInverseConfiguration(name = "to")
    SOURCE from(TARGET target);

    /**
     * 目标对象集合 -> 来源对象集合
     *
     * @param targets 目标对象集合
     * @return 来源对象集合
     */
    @InheritInverseConfiguration(name = "to")
    List<SOURCE> from(List<TARGET> targets);

    /**
     * 目标流对象 -> 来源对象集合
     *
     * @param targetStream 目标流对象
     * @return 来源对象集合
     */
    @InheritInverseConfiguration
    List<SOURCE> from(Stream<TARGET> targetStream);
}
