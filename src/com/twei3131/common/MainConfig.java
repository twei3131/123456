package com.twei3131.common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

public class MainConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		// TODO Auto-generated method stub
		me.setViewType(ViewType.JSP);
		PropKit.use("config.properties");
		me.setDevMode(PropKit.getBoolean("devMode"));
		me.setBaseUploadPath("twei3131Load");
		me.setMaxPostSize(104857600);
	}

	@Override
	public void configRoute(Routes me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub
//		C3p0Plugin c3p0Plugin = new C3p0Plugin(PropKit.get("jdbcUrl"),PropKit.get("user"),PropKit.get("password"));
//		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
//		arp.setShowSql(true);
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args){
		JFinal.start("WebRoot",8080,"/",5);
	}

}
