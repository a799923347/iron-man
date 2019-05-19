package com.bowen.ironmanweb.douban;

import java.io.IOException;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.collections4.CollectionUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

/**
 * @author zhaobaowen
 */
@Slf4j
public class ZuFang {

  private static final OkHttpClient OK_HTTP_CLIENT = new OkHttpClient();

  public static void main(String[] args) throws IOException {
    Document document = Jsoup.connect("https://www.douban.com/group/shanghaizufang/discussion?start=60").get();
    log.info("=======");
    List<Node> olt = document.getElementsByClass("olt").get(0).childNodes().get(1).childNodes();
    //document.getElementsByClass("olt").elementData(0).childNodes.get(1).childNodes;
    log.info("size of olt:{}", olt.size());
    for (int i = 0; i < olt.size(); i++) {
      if (i % 2 != 0 || i == 0) {
        continue;
      }
      List<Node> nodes = olt.get(i).childNodes().get(1).childNodes();
      String href;
      String title;
      if (CollectionUtils.size(nodes) >= 4) {
        href = olt.get(i).childNodes().get(1).childNodes().get(3).attr("href");
        title = olt.get(i).childNodes().get(1).childNodes().get(3).attr("title");
      } else {
        href = olt.get(i).childNodes().get(1).childNodes().get(1).attr("href");
        title = olt.get(i).childNodes().get(1).childNodes().get(1).attr("title");
      }
      log.info("title:{},url:{}", title, href);
    }

  }
}
