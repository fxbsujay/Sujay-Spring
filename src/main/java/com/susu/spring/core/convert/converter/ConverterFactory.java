package com.susu.spring.core.convert.converter;

/**
 * 类型转换工厂
 */
public interface ConverterFactory<S, R> {

	<T extends R> Converter<S, T> getConverter(Class<T> targetType);
}