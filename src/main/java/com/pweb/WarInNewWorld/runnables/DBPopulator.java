package com.pweb.WarInNewWorld.runnables;

import com.pweb.WarInNewWorld.model.*;
import com.pweb.WarInNewWorld.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBPopulator implements CommandLineRunner {
    @Autowired
    BunkerService bunkerService;
    @Autowired
    NewsTypeService newsTypeService;
    @Autowired
    NewsService newsService;
    @Autowired
    ReviewService reviewService;
    @Autowired
    SubscriberService subscriberService;
    @Autowired
    GoodsTypeService goodsTypeService;
    @Autowired
    NecessityGoodsService necessityGoodsService;

    @Override
    public void run(String... args) throws Exception {
        // add News Type
        // add news
//        NewsType newsTypeNews = new NewsType();
//        newsTypeNews.setNewsTypeName("news");
//        newsTypeService.addNewsType(newsTypeNews);
//
//        // add article
//        NewsType newsTypeArticle = new NewsType();
//        newsTypeArticle.setNewsTypeName("article");
//        newsTypeService.addNewsType(newsTypeArticle);
//
//        // add User Type
//        // add first journalist
//        UserType userTypeWriter = new UserType();
//        userTypeWriter.setName("journalist");
//        userTypeService.addUserType(userTypeWriter);
//
//        // add first admin
//        UserType userTypeAdmin = new UserType();
//        userTypeAdmin.setName("admin");
//        userTypeService.addUserType(userTypeAdmin);
//
//        // add User
//        // add first writer
//        User firstWriter = new User();
//        firstWriter.setEmail("paiuandreea18@gmail.com");
//        firstWriter.setUserType(userTypeWriter);
//        firstWriter.setTrusted(true);
//        userService.addUser(firstWriter);
//
//        // add first admin
//        User firstValidator = new User();
//        firstValidator.setEmail("paiuandreea18@yahoo.com");
//        firstValidator.setUserType(userTypeAdmin);
//        firstValidator.setTrusted(true);
//        userService.addUser(firstValidator);
//
//        User firstWriterReview = new User();
//        firstWriterReview.setEmail("paiuandreea19@gmail.com");
//        firstWriterReview.setUserType(userTypeWriter);
//        firstWriterReview.setTrusted(true);
//        userService.addUser(firstWriterReview);
//
//        // add News
//        // set date
//        long millis = System.currentTimeMillis();
//        java.sql.Date date = new java.sql.Date(millis);
//
//        // add first news
//        News news = new News();
//        news.setPublicationDate(date);
//        news.setBody("body pentru primul news");
//        news.setTitle("News1");
//        news.setValidated(true);
//        news.setFileLink("https://cdn.pixabay.com/photo/2015/02/24/15/41/wolf-647528__340.jpg");
//        news.setNewsType(newsTypeNews); // nu stiu daca e asa
//        news.setCounty_ids(1);
//        news.setWriter(firstWriter);
//        news.setValidator(firstValidator);
//        newsService.addNews(news);
//
//        // add first article
//        News article = new News();
//        article.setPublicationDate(date);
//        article.setBody("body pentru primul articol");
//        article.setTitle("Articol1");
//        article.setValidated(true);
//        article.setFileLink("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg");
//        article.setNewsType(newsTypeArticle); // nu stiu daca e asa
//        article.setCounty_ids(1);
//        article.setWriter(firstWriter);
//        article.setValidator(firstValidator);
//        newsService.addNews(article);
//
//        // add Review Type
//        // add Good
//        ReviewType reviewTypeGood = new ReviewType();
//        reviewTypeGood.setReviewTypeName("good");
//        reviewTypeService.addReviewType(reviewTypeGood);
//
//        // add Bad
//        ReviewType reviewTypeBad = new ReviewType();
//        reviewTypeBad.setReviewTypeName("bad");
//        reviewTypeService.addReviewType(reviewTypeBad);
//
//        // add Review
//        // add first review
//        Review firstReview = new Review();
//        firstReview.setPublicationDate(date);
//        firstReview.setContent("Content first Review");
//        firstReview.setAnalysed(true);
//        firstReview.setValidated(true);
//        firstReview.setReviewType(reviewTypeGood);
//        firstReview.setWhom(news);
//        firstReview.setWriterReview(firstWriterReview);
//        reviewService.addReview(firstReview);
//
//        // add Subscriber
//        Subscriber firstSubscriber = new Subscriber();
//        firstSubscriber.setEmail("paiuandreea18@gmail.com");
//        firstSubscriber.setCounty_id(1);
//        subscriberService.addSubscriber(firstSubscriber);
//
//        // add Goods Type
//        // add food
//        GoodsType goodsTypeFood = new GoodsType();
//        goodsTypeFood.setGoodTypeName("food");
//        goodsTypeService.addGoodsType(goodsTypeFood);
//
//        // add clothes
//        GoodsType goodsTypeClothes = new GoodsType();
//        goodsTypeClothes.setGoodTypeName("clothes");
//        goodsTypeService.addGoodsType(goodsTypeClothes);
//
//        // add weaponry
//        GoodsType goodsTypeWeaponry = new GoodsType();
//        goodsTypeWeaponry.setGoodTypeName("weaponry");
//        goodsTypeService.addGoodsType(goodsTypeWeaponry);
//
//        // add others
//        GoodsType goodsTypeOthers = new GoodsType();
//        goodsTypeOthers.setGoodTypeName("others");
//        goodsTypeService.addGoodsType(goodsTypeOthers);
//
//        // add Necessity Goods
//        // add food
//        NecessityGoods necessityGoodsFood = new NecessityGoods();
//        necessityGoodsFood.setAddress("adresa1");
//        necessityGoodsFood.setGoodsType(goodsTypeFood);
//        necessityGoodsFood.setCityId(1);
//        necessityGoodsFood.setCurrentCapacity(10);
//        necessityGoodsFood.setMaximCapacity(100);
//        necessityGoodsFood.setLastUpdate(date);
//        necessityGoodsService.addNecessityGoods(necessityGoodsFood);
//
//        // add Bunker
//        // add first bunker
//        Bunker bunker = new Bunker();
//        bunker.setAddress("Address2");
//        bunker.setCityId(1);
//        bunker.setCurrentCapacity(10);
//        bunker.setLastUpdate(date);
//        bunker.setMaximCapacity(110);
//        bunkerService.addBunker(bunker);
    }
}
