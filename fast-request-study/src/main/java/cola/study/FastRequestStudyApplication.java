package cola.study;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 快请求研究应用程序
 *
 * @author Cola0502
 * @date 2023/05/27
 */
@SpringBootApplication
@Slf4j
public class FastRequestStudyApplication {

    /**
     * 主要
     * main
     *
     * @param args arg
     */
    public static void main(String[] args) {
        SpringApplication.run(FastRequestStudyApplication.class, args);
        log.info("FastRequestStudy run success");
    }

}
