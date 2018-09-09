package com.bowen.ironmanweb.controller;

import com.bowen.service.bean.JsonResult;
import com.bowen.service.bean.UserInfoModel;
import com.google.common.collect.Lists;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BackendController {

  @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
  public String index(@RequestParam("page") String page){
    return page;
  }

  @RequestMapping(value = {"/table"}, method = RequestMethod.GET)
  public String table(){
    return "table";
  }

  @RequestMapping(value = {"/demo/table/user"}, method = RequestMethod.GET)
  @ResponseBody
  public JsonResult userInfo(){
    List<Object> userInfoModels = getUserInfo();
    //return "{\"code\":0,\"msg\":\"\",\"count\":1000,\"data\":[{\"id\":10007,\"username\":\"user-7\",\"sex\":\"男\",\"city\":\"城市-7\",\"sign\":\"签名-7\",\"experience\":727,\"logins\":150,\"wealth\":82030578,\"classify\":\"作家\",\"score\":28},{\"id\":10008,\"username\":\"user-8\",\"sex\":\"男\",\"city\":\"城市-8\",\"sign\":\"签名-8\",\"experience\":951,\"logins\":133,\"wealth\":16503371,\"classify\":\"词人\",\"score\":14},{\"id\":10009,\"username\":\"user-9\",\"sex\":\"女\",\"city\":\"城市-9\",\"sign\":\"签名-9\",\"experience\":484,\"logins\":25,\"wealth\":86801934,\"classify\":\"词人\",\"score\":75},{\"id\":10010,\"username\":\"user-10\",\"sex\":\"女\",\"city\":\"城市-10\",\"sign\":\"签名-10\",\"experience\":1016,\"logins\":182,\"wealth\":71294671,\"classify\":\"诗人\",\"score\":34},{\"id\":10011,\"username\":\"user-11\",\"sex\":\"女\",\"city\":\"城市-11\",\"sign\":\"签名-11\",\"experience\":492,\"logins\":107,\"wealth\":8062783,\"classify\":\"诗人\",\"score\":6},{\"id\":10012,\"username\":\"user-12\",\"sex\":\"女\",\"city\":\"城市-12\",\"sign\":\"签名-12\",\"experience\":106,\"logins\":176,\"wealth\":42622704,\"classify\":\"词人\",\"score\":54},{\"id\":10013,\"username\":\"user-13\",\"sex\":\"男\",\"city\":\"城市-13\",\"sign\":\"签名-13\",\"experience\":1047,\"logins\":94,\"wealth\":59508583,\"classify\":\"诗人\",\"score\":63},{\"id\":10014,\"username\":\"user-14\",\"sex\":\"男\",\"city\":\"城市-14\",\"sign\":\"签名-14\",\"experience\":873,\"logins\":116,\"wealth\":72549912,\"classify\":\"词人\",\"score\":8},{\"id\":10015,\"username\":\"user-15\",\"sex\":\"女\",\"city\":\"城市-15\",\"sign\":\"签名-15\",\"experience\":1068,\"logins\":27,\"wealth\":52737025,\"classify\":\"作家\",\"score\":28},{\"id\":10016,\"username\":\"user-16\",\"sex\":\"女\",\"city\":\"城市-16\",\"sign\":\"签名-16\",\"experience\":862,\"logins\":168,\"wealth\":37069775,\"classify\":\"酱油\",\"score\":86},{\"id\":10017,\"username\":\"user-17\",\"sex\":\"女\",\"city\":\"城市-17\",\"sign\":\"签名-17\",\"experience\":1060,\"logins\":187,\"wealth\":66099525,\"classify\":\"作家\",\"score\":69},{\"id\":10018,\"username\":\"user-18\",\"sex\":\"女\",\"city\":\"城市-18\",\"sign\":\"签名-18\",\"experience\":866,\"logins\":88,\"wealth\":81722326,\"classify\":\"词人\",\"score\":74},{\"id\":10019,\"username\":\"user-19\",\"sex\":\"女\",\"city\":\"城市-19\",\"sign\":\"签名-19\",\"experience\":682,\"logins\":106,\"wealth\":68647362,\"classify\":\"词人\",\"score\":51},{\"id\":10020,\"username\":\"user-20\",\"sex\":\"男\",\"city\":\"城市-20\",\"sign\":\"签名-20\",\"experience\":770,\"logins\":24,\"wealth\":92420248,\"classify\":\"诗人\",\"score\":87},{\"id\":10021,\"username\":\"user-21\",\"sex\":\"男\",\"city\":\"城市-21\",\"sign\":\"签名-21\",\"experience\":184,\"logins\":131,\"wealth\":71566045,\"classify\":\"词人\",\"score\":99},{\"id\":10022,\"username\":\"user-22\",\"sex\":\"男\",\"city\":\"城市-22\",\"sign\":\"签名-22\",\"experience\":739,\"logins\":152,\"wealth\":60907929,\"classify\":\"作家\",\"score\":18},{\"id\":10023,\"username\":\"user-23\",\"sex\":\"女\",\"city\":\"城市-23\",\"sign\":\"签名-23\",\"experience\":127,\"logins\":82,\"wealth\":14765943,\"classify\":\"作家\",\"score\":30},{\"id\":10024,\"username\":\"user-24\",\"sex\":\"女\",\"city\":\"城市-24\",\"sign\":\"签名-24\",\"experience\":212,\"logins\":133,\"wealth\":59011052,\"classify\":\"词人\",\"score\":76},{\"id\":10025,\"username\":\"user-25\",\"sex\":\"女\",\"city\":\"城市-25\",\"sign\":\"签名-25\",\"experience\":938,\"logins\":182,\"wealth\":91183097,\"classify\":\"作家\",\"score\":69},{\"id\":10026,\"username\":\"user-26\",\"sex\":\"男\",\"city\":\"城市-26\",\"sign\":\"签名-26\",\"experience\":978,\"logins\":7,\"wealth\":48008413,\"classify\":\"作家\",\"score\":65},{\"id\":10027,\"username\":\"user-27\",\"sex\":\"女\",\"city\":\"城市-27\",\"sign\":\"签名-27\",\"experience\":371,\"logins\":44,\"wealth\":64419691,\"classify\":\"诗人\",\"score\":60},{\"id\":10028,\"username\":\"user-28\",\"sex\":\"女\",\"city\":\"城市-28\",\"sign\":\"签名-28\",\"experience\":977,\"logins\":21,\"wealth\":75935022,\"classify\":\"作家\",\"score\":37},{\"id\":10029,\"username\":\"user-29\",\"sex\":\"男\",\"city\":\"城市-29\",\"sign\":\"签名-29\",\"experience\":647,\"logins\":107,\"wealth\":97450636,\"classify\":\"酱油\",\"score\":27}]}";
    return JsonResult.success("", userInfoModels.size(), userInfoModels);
  }

  @RequestMapping(value = {"/demo/table/clusterTable"}, method = RequestMethod.GET)
  @ResponseBody
  public String clusterTable(){
    return "{\"code\":0,\"msg\":\"\",\"count\":1000,\"data\":[{\"type\":\"优秀\",\"count\":4,\"scoreRange\":\"85-90\",\"minError\":0.75,\"maxError\":2.75,\"averError\":1.75},{\"type\":\"良好\",\"count\":21,\"scoreRange\":\"78-84\",\"minError\":0.1,\"maxError\":3.10,\"averError\":1.82},{\"type\":\"中等\",\"count\":35,\"scoreRange\":\"70-77\",\"minError\":0.37,\"maxError\":3.63,\"averError\":1.95},{\"type\":\"及格\",\"count\":40,\"scoreRange\":\"60-69\",\"minError\":0.15,\"maxError\":4.85,\"averError\":2.27},{\"type\":\"不及格\",\"count\":8,\"scoreRange\":\"43-56\",\"minError\":0.62,\"maxError\":6.38,\"averError\":2.97}]}";
  }

  private List<Object> getUserInfo() {
    List<Object> userInfoModels = Lists.newLinkedList();
    userInfoModels.add(new UserInfoModel(10000L, "user-0", "女", "城市-0", "签名-0", 255, 24, 82830700, "作家", 57));
    userInfoModels.add(new UserInfoModel(10001L, "user-1", "男", "城市-1", "签名-1", 884, 58, 64928690, "词人", 27));
    userInfoModels.add(new UserInfoModel(10002L, "user-2", "女", "城市-2", "签名-2", 650, 77, 6298078, "酱油", 31));
    userInfoModels.add(new UserInfoModel(10003L, "user-3", "女", "城市-3", "签名-3", 362, 157, 37117017, "诗人", 68));
    userInfoModels.add(new UserInfoModel(10004L, "user-4", "女", "城市-4", "签名-4", 807, 51, 76263262, "作家", 6));
    userInfoModels.add(new UserInfoModel(10005L, "user-5", "女", "城市-5", "签名-5", 173, 68, 60344147, "作家", 87));
    userInfoModels.add(new UserInfoModel(10006L, "user-6", "女", "城市-6", "签名-6", 982, 37, 57768166, "作家", 34));
    userInfoModels.add(new UserInfoModel(10007L, "user-7", "女", "城市-7", "签名-7", 727, 150, 82030578, "作家", 28));
    userInfoModels.add(new UserInfoModel(10008L, "user-8", "女", "城市-8", "签名-8", 368, 29, 68390292, "作家", 63));
    userInfoModels.add(new UserInfoModel(10009L, "user-9", "女", "城市-9", "签名-9", 382, 26, 72294720, "作家", 82));
    userInfoModels.add(new UserInfoModel(10010L, "user-10", "女", "城市-10", "签名-10", 492, 29, 872927202, "作家", 62));
    userInfoModels.add(new UserInfoModel(10011L, "user-11", "女", "城市-11", "签名-11", 255, 24, 82830700, "作家", 57));
    userInfoModels.add(new UserInfoModel(10012L, "user-12", "女", "城市-12", "签名-12", 255, 24, 82830700, "作家", 57));
    userInfoModels.add(new UserInfoModel(10013L, "user-13", "女", "城市-13", "签名-13", 255, 24, 82830700, "作家", 57));
    userInfoModels.add(new UserInfoModel(10014L, "user-14", "女", "城市-14", "签名-14", 255, 24, 82830700, "作家", 57));
    userInfoModels.add(new UserInfoModel(10015L, "user-15", "女", "城市-15", "签名-15", 255, 24, 82830700, "作家", 57));
    userInfoModels.add(new UserInfoModel(10016L, "user-16", "女", "城市-16", "签名-16", 255, 24, 82830700, "作家", 57));
    userInfoModels.add(new UserInfoModel(10017L, "user-17", "女", "城市-17", "签名-17", 255, 24, 82830700, "作家", 57));
    userInfoModels.add(new UserInfoModel(10018L, "user-18", "女", "城市-18", "签名-18", 255, 24, 82830700, "作家", 57));
    return userInfoModels;
  }
}
