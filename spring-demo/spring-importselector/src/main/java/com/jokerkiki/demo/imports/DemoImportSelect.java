package com.jokerkiki.demo.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 *
 * 自定义逻辑返回需要的组件
 */
public class DemoImportSelect implements ImportSelector {
    /**
     * 返回数组 ，每个string为返回需要组件的全类名
     * @param annotationMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{"com.jokerkiki.demo.entity.Student"};
    }
}
