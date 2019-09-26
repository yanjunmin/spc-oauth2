package top.westyle.cloud.getway.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableOAuth2Sso //开启oa uth 的单点登录模式，以免去进行用户校验时的频繁请求
//单点登录： Single Sign On ，简称sso 。sso 使得在多个应用系统
//中，用户只需要登录一次就可以访问所有相互信任的应用系统。
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }
}
