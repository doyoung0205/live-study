package com.company.annotaions;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

public class LoggerProcessor extends AbstractProcessor {

    /**
     * 이 프로세서로 처리할 애노테이션
     */
    @Override
    public Set<String> getSupportedOptions() {
        return Set.of(Logger.class.getName());
    }

    /**
     * 어떤 소스코드 버전을 지원할 것인지 명시
     * (필요하지 않다면 재정의하지 않아도 됨)
     */
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    /**
     * 애노테이션을 처리하기
     */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(Logger.class);

        elements.forEach(el -> {
            if (el.getKind() != ElementKind.METHOD) {
                // 애노테이션이 메소드에 붙어있지 않다면 에러 발생!
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Cannot use this annotation!");
            } else {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "Processing...");
            }
        });

        // 애노테이션이 이 프로세서에 특화되어있다면 true, 다른 프로레서에서도 처리가 가능하다면 false
        return true;
    }
}
