package com.vnsports.lovephui;

import com.vnsports.lovephui.LovephuiApp;
import com.vnsports.lovephui.config.AsyncSyncConfiguration;
import com.vnsports.lovephui.config.EmbeddedElasticsearch;
import com.vnsports.lovephui.config.EmbeddedKafka;
import com.vnsports.lovephui.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { LovephuiApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
