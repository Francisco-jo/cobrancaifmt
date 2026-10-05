package edu.ifmt.cobrancaifmt;

import java.util.Locale;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class CobrancaifmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(CobrancaifmtApplication.class, args);
	}
	@Bean
    public LocaleResolver localeResolver() {
        // configura pelas normas brasileiras: datas, moedas, idioma
        return new FixedLocaleResolver(Locale.forLanguageTag("pt-BR"));
    }

}
