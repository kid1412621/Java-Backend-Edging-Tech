package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
//@NoArgsConstructor
@Table(name = "t_user", schema = "xcx", catalog = "")
public class TUser {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String openid;
    private String openidPro;
    private String openidAnd;
    private String openidIos;
    private String openidH5;
    private String openidSearch;
    private String sessionKey;
    private String password;
    private String nickName;
    private String avatar;
    private String unionid;
    @CreatedDate
    private Timestamp createTime;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp updateTime;
    private String mobile;
    private int role;
    private String email;
    private String shadowAccount;
    private String shadowPassword;
    private int platform;
    private int gender;
    private String country;
    private String province;
    private String city;
    private String language;
    private int smallFishCurrency;
    private int bigFishCurrency;
    private long courseDuration;
    private long pkgameAmount;
    private String uuid;
    private String qrcodeUrl;
    private int continuousCheckInDays;
    private int resurrectionNum;
    private int kingCoinAmount;
    private String signature;
    private int ffAuthorType;
    private String ffIntroduction;
    private int ffSubscribeNum;
    private int ffArticleNum;
    private int ffShareNum;
    private int ffShareActualNum;
    private int ffViewNum;
    private int ffViewActualNum;
    private int ffCollectNum;
    private int ffCollectActualNum;
    private int ffFavNum;
    private int ffSubNum;
    private int svVideoNum;
    private int svPlayedNum;
    private int svLikedNum;
    private int svLikeNum;
    private int svSharedNum;
    private int afAskNum;
    private int afAnswerNum;
    private int afLikedNum;
    private int afCollectNum;
    private int afSharedNum;
    private int topCmtNum;
    private String hrName;
    private String hrValidateTel;
    private String hrPosition;
    private String hrCompany;
    private String hrPublicTel;
    private String hrPublicEmail;
    private int followNum;
    private int fanNum;
    private int level;
    private int levelStar;
    private int state;
    private int ffStarNum;
    private int ffStarActualNum;
    private int hrState;
    private int vipLevel;
    private int honorNum;
    private int afHighestLikedNum;
    private int svHighestLikedNum;
    private int certVipLevel;
    private int mtCollectNum;
    private int hrJobsNum;
    private int cnDemandNum;
    private int practiceNum;

//    @Id
//    @Column(name = "id")
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "openid")
//    public String getOpenid() {
//        return openid;
//    }
//
//    public void setOpenid(String openid) {
//        this.openid = openid;
//    }
//
//    @Basic
//    @Column(name = "openid_pro")
//    public String getOpenidPro() {
//        return openidPro;
//    }
//
//    public void setOpenidPro(String openidPro) {
//        this.openidPro = openidPro;
//    }
//
//    @Basic
//    @Column(name = "openid_and")
//    public String getOpenidAnd() {
//        return openidAnd;
//    }
//
//    public void setOpenidAnd(String openidAnd) {
//        this.openidAnd = openidAnd;
//    }
//
//    @Basic
//    @Column(name = "openid_ios")
//    public String getOpenidIos() {
//        return openidIos;
//    }
//
//    public void setOpenidIos(String openidIos) {
//        this.openidIos = openidIos;
//    }
//
//    @Basic
//    @Column(name = "openid_h5")
//    public String getOpenidH5() {
//        return openidH5;
//    }
//
//    public void setOpenidH5(String openidH5) {
//        this.openidH5 = openidH5;
//    }
//
//    @Basic
//    @Column(name = "openid_search")
//    public String getOpenidSearch() {
//        return openidSearch;
//    }
//
//    public void setOpenidSearch(String openidSearch) {
//        this.openidSearch = openidSearch;
//    }
//
//    @Basic
//    @Column(name = "session_key")
//    public String getSessionKey() {
//        return sessionKey;
//    }
//
//    public void setSessionKey(String sessionKey) {
//        this.sessionKey = sessionKey;
//    }
//
//    @Basic
//    @Column(name = "password")
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Basic
//    @Column(name = "nick_name")
//    public String getNickName() {
//        return nickName;
//    }
//
//    public void setNickName(String nickName) {
//        this.nickName = nickName;
//    }
//
//    @Basic
//    @Column(name = "avatar")
//    public String getAvatar() {
//        return avatar;
//    }
//
//    public void setAvatar(String avatar) {
//        this.avatar = avatar;
//    }
//
//    @Basic
//    @Column(name = "unionid")
//    public String getUnionid() {
//        return unionid;
//    }
//
//    public void setUnionid(String unionid) {
//        this.unionid = unionid;
//    }
//
//    @Basic
//    @Column(name = "create_time")
//    public Timestamp getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Timestamp createTime) {
//        this.createTime = createTime;
//    }
//
//    @Basic
//    @Column(name = "update_time")
//    public Timestamp getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(Timestamp updateTime) {
//        this.updateTime = updateTime;
//    }
//
//    @Basic
//    @Column(name = "mobile")
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//    @Basic
//    @Column(name = "role")
//    public int getRole() {
//        return role;
//    }
//
//    public void setRole(int role) {
//        this.role = role;
//    }
//
//    @Basic
//    @Column(name = "email")
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Basic
//    @Column(name = "shadow_account")
//    public String getShadowAccount() {
//        return shadowAccount;
//    }
//
//    public void setShadowAccount(String shadowAccount) {
//        this.shadowAccount = shadowAccount;
//    }
//
//    @Basic
//    @Column(name = "shadow_password")
//    public String getShadowPassword() {
//        return shadowPassword;
//    }
//
//    public void setShadowPassword(String shadowPassword) {
//        this.shadowPassword = shadowPassword;
//    }
//
//    @Basic
//    @Column(name = "platform")
//    public int getPlatform() {
//        return platform;
//    }
//
//    public void setPlatform(int platform) {
//        this.platform = platform;
//    }
//
//    @Basic
//    @Column(name = "gender")
//    public int getGender() {
//        return gender;
//    }
//
//    public void setGender(int gender) {
//        this.gender = gender;
//    }
//
//    @Basic
//    @Column(name = "country")
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    @Basic
//    @Column(name = "province")
//    public String getProvince() {
//        return province;
//    }
//
//    public void setProvince(String province) {
//        this.province = province;
//    }
//
//    @Basic
//    @Column(name = "city")
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    @Basic
//    @Column(name = "language")
//    public String getLanguage() {
//        return language;
//    }
//
//    public void setLanguage(String language) {
//        this.language = language;
//    }
//
//    @Basic
//    @Column(name = "small_fish_currency")
//    public int getSmallFishCurrency() {
//        return smallFishCurrency;
//    }
//
//    public void setSmallFishCurrency(int smallFishCurrency) {
//        this.smallFishCurrency = smallFishCurrency;
//    }
//
//    @Basic
//    @Column(name = "big_fish_currency")
//    public int getBigFishCurrency() {
//        return bigFishCurrency;
//    }
//
//    public void setBigFishCurrency(int bigFishCurrency) {
//        this.bigFishCurrency = bigFishCurrency;
//    }
//
//    @Basic
//    @Column(name = "course_duration")
//    public long getCourseDuration() {
//        return courseDuration;
//    }
//
//    public void setCourseDuration(long courseDuration) {
//        this.courseDuration = courseDuration;
//    }
//
//    @Basic
//    @Column(name = "pkgame_amount")
//    public long getPkgameAmount() {
//        return pkgameAmount;
//    }
//
//    public void setPkgameAmount(long pkgameAmount) {
//        this.pkgameAmount = pkgameAmount;
//    }
//
//    @Basic
//    @Column(name = "uuid")
//    public String getUuid() {
//        return uuid;
//    }
//
//    public void setUuid(String uuid) {
//        this.uuid = uuid;
//    }
//
//    @Basic
//    @Column(name = "qrcode_url")
//    public String getQrcodeUrl() {
//        return qrcodeUrl;
//    }
//
//    public void setQrcodeUrl(String qrcodeUrl) {
//        this.qrcodeUrl = qrcodeUrl;
//    }
//
//    @Basic
//    @Column(name = "continuous_check_in_days")
//    public int getContinuousCheckInDays() {
//        return continuousCheckInDays;
//    }
//
//    public void setContinuousCheckInDays(int continuousCheckInDays) {
//        this.continuousCheckInDays = continuousCheckInDays;
//    }
//
//    @Basic
//    @Column(name = "resurrection_num")
//    public int getResurrectionNum() {
//        return resurrectionNum;
//    }
//
//    public void setResurrectionNum(int resurrectionNum) {
//        this.resurrectionNum = resurrectionNum;
//    }
//
//    @Basic
//    @Column(name = "king_coin_amount")
//    public int getKingCoinAmount() {
//        return kingCoinAmount;
//    }
//
//    public void setKingCoinAmount(int kingCoinAmount) {
//        this.kingCoinAmount = kingCoinAmount;
//    }
//
//    @Basic
//    @Column(name = "signature")
//    public String getSignature() {
//        return signature;
//    }
//
//    public void setSignature(String signature) {
//        this.signature = signature;
//    }
//
//    @Basic
//    @Column(name = "ff_author_type")
//    public int getFfAuthorType() {
//        return ffAuthorType;
//    }
//
//    public void setFfAuthorType(int ffAuthorType) {
//        this.ffAuthorType = ffAuthorType;
//    }
//
//    @Basic
//    @Column(name = "ff_introduction")
//    public String getFfIntroduction() {
//        return ffIntroduction;
//    }
//
//    public void setFfIntroduction(String ffIntroduction) {
//        this.ffIntroduction = ffIntroduction;
//    }
//
//    @Basic
//    @Column(name = "ff_subscribe_num")
//    public int getFfSubscribeNum() {
//        return ffSubscribeNum;
//    }
//
//    public void setFfSubscribeNum(int ffSubscribeNum) {
//        this.ffSubscribeNum = ffSubscribeNum;
//    }
//
//    @Basic
//    @Column(name = "ff_article_num")
//    public int getFfArticleNum() {
//        return ffArticleNum;
//    }
//
//    public void setFfArticleNum(int ffArticleNum) {
//        this.ffArticleNum = ffArticleNum;
//    }
//
//    @Basic
//    @Column(name = "ff_share_num")
//    public int getFfShareNum() {
//        return ffShareNum;
//    }
//
//    public void setFfShareNum(int ffShareNum) {
//        this.ffShareNum = ffShareNum;
//    }
//
//    @Basic
//    @Column(name = "ff_share_actual_num")
//    public int getFfShareActualNum() {
//        return ffShareActualNum;
//    }
//
//    public void setFfShareActualNum(int ffShareActualNum) {
//        this.ffShareActualNum = ffShareActualNum;
//    }
//
//    @Basic
//    @Column(name = "ff_view_num")
//    public int getFfViewNum() {
//        return ffViewNum;
//    }
//
//    public void setFfViewNum(int ffViewNum) {
//        this.ffViewNum = ffViewNum;
//    }
//
//    @Basic
//    @Column(name = "ff_view_actual_num")
//    public int getFfViewActualNum() {
//        return ffViewActualNum;
//    }
//
//    public void setFfViewActualNum(int ffViewActualNum) {
//        this.ffViewActualNum = ffViewActualNum;
//    }
//
//    @Basic
//    @Column(name = "ff_collect_num")
//    public int getFfCollectNum() {
//        return ffCollectNum;
//    }
//
//    public void setFfCollectNum(int ffCollectNum) {
//        this.ffCollectNum = ffCollectNum;
//    }
//
//    @Basic
//    @Column(name = "ff_collect_actual_num")
//    public int getFfCollectActualNum() {
//        return ffCollectActualNum;
//    }
//
//    public void setFfCollectActualNum(int ffCollectActualNum) {
//        this.ffCollectActualNum = ffCollectActualNum;
//    }
//
//    @Basic
//    @Column(name = "ff_fav_num")
//    public int getFfFavNum() {
//        return ffFavNum;
//    }
//
//    public void setFfFavNum(int ffFavNum) {
//        this.ffFavNum = ffFavNum;
//    }
//
//    @Basic
//    @Column(name = "ff_sub_num")
//    public int getFfSubNum() {
//        return ffSubNum;
//    }
//
//    public void setFfSubNum(int ffSubNum) {
//        this.ffSubNum = ffSubNum;
//    }
//
//    @Basic
//    @Column(name = "sv_video_num")
//    public int getSvVideoNum() {
//        return svVideoNum;
//    }
//
//    public void setSvVideoNum(int svVideoNum) {
//        this.svVideoNum = svVideoNum;
//    }
//
//    @Basic
//    @Column(name = "sv_played_num")
//    public int getSvPlayedNum() {
//        return svPlayedNum;
//    }
//
//    public void setSvPlayedNum(int svPlayedNum) {
//        this.svPlayedNum = svPlayedNum;
//    }
//
//    @Basic
//    @Column(name = "sv_liked_num")
//    public int getSvLikedNum() {
//        return svLikedNum;
//    }
//
//    public void setSvLikedNum(int svLikedNum) {
//        this.svLikedNum = svLikedNum;
//    }
//
//    @Basic
//    @Column(name = "sv_like_num")
//    public int getSvLikeNum() {
//        return svLikeNum;
//    }
//
//    public void setSvLikeNum(int svLikeNum) {
//        this.svLikeNum = svLikeNum;
//    }
//
//    @Basic
//    @Column(name = "sv_shared_num")
//    public int getSvSharedNum() {
//        return svSharedNum;
//    }
//
//    public void setSvSharedNum(int svSharedNum) {
//        this.svSharedNum = svSharedNum;
//    }
//
//    @Basic
//    @Column(name = "af_ask_num")
//    public int getAfAskNum() {
//        return afAskNum;
//    }
//
//    public void setAfAskNum(int afAskNum) {
//        this.afAskNum = afAskNum;
//    }
//
//    @Basic
//    @Column(name = "af_answer_num")
//    public int getAfAnswerNum() {
//        return afAnswerNum;
//    }
//
//    public void setAfAnswerNum(int afAnswerNum) {
//        this.afAnswerNum = afAnswerNum;
//    }
//
//    @Basic
//    @Column(name = "af_liked_num")
//    public int getAfLikedNum() {
//        return afLikedNum;
//    }
//
//    public void setAfLikedNum(int afLikedNum) {
//        this.afLikedNum = afLikedNum;
//    }
//
//    @Basic
//    @Column(name = "af_collect_num")
//    public int getAfCollectNum() {
//        return afCollectNum;
//    }
//
//    public void setAfCollectNum(int afCollectNum) {
//        this.afCollectNum = afCollectNum;
//    }
//
//    @Basic
//    @Column(name = "af_shared_num")
//    public int getAfSharedNum() {
//        return afSharedNum;
//    }
//
//    public void setAfSharedNum(int afSharedNum) {
//        this.afSharedNum = afSharedNum;
//    }
//
//    @Basic
//    @Column(name = "top_cmt_num")
//    public int getTopCmtNum() {
//        return topCmtNum;
//    }
//
//    public void setTopCmtNum(int topCmtNum) {
//        this.topCmtNum = topCmtNum;
//    }
//
//    @Basic
//    @Column(name = "hr_name")
//    public String getHrName() {
//        return hrName;
//    }
//
//    public void setHrName(String hrName) {
//        this.hrName = hrName;
//    }
//
//    @Basic
//    @Column(name = "hr_validate_tel")
//    public String getHrValidateTel() {
//        return hrValidateTel;
//    }
//
//    public void setHrValidateTel(String hrValidateTel) {
//        this.hrValidateTel = hrValidateTel;
//    }
//
//    @Basic
//    @Column(name = "hr_position")
//    public String getHrPosition() {
//        return hrPosition;
//    }
//
//    public void setHrPosition(String hrPosition) {
//        this.hrPosition = hrPosition;
//    }
//
//    @Basic
//    @Column(name = "hr_company")
//    public String getHrCompany() {
//        return hrCompany;
//    }
//
//    public void setHrCompany(String hrCompany) {
//        this.hrCompany = hrCompany;
//    }
//
//    @Basic
//    @Column(name = "hr_public_tel")
//    public String getHrPublicTel() {
//        return hrPublicTel;
//    }
//
//    public void setHrPublicTel(String hrPublicTel) {
//        this.hrPublicTel = hrPublicTel;
//    }
//
//    @Basic
//    @Column(name = "hr_public_email")
//    public String getHrPublicEmail() {
//        return hrPublicEmail;
//    }
//
//    public void setHrPublicEmail(String hrPublicEmail) {
//        this.hrPublicEmail = hrPublicEmail;
//    }
//
//    @Basic
//    @Column(name = "follow_num")
//    public int getFollowNum() {
//        return followNum;
//    }
//
//    public void setFollowNum(int followNum) {
//        this.followNum = followNum;
//    }
//
//    @Basic
//    @Column(name = "fan_num")
//    public int getFanNum() {
//        return fanNum;
//    }
//
//    public void setFanNum(int fanNum) {
//        this.fanNum = fanNum;
//    }
//
//    @Basic
//    @Column(name = "level")
//    public int getLevel() {
//        return level;
//    }
//
//    public void setLevel(int level) {
//        this.level = level;
//    }
//
//    @Basic
//    @Column(name = "level_star")
//    public int getLevelStar() {
//        return levelStar;
//    }
//
//    public void setLevelStar(int levelStar) {
//        this.levelStar = levelStar;
//    }
//
//    @Basic
//    @Column(name = "state")
//    public int getState() {
//        return state;
//    }
//
//    public void setState(int state) {
//        this.state = state;
//    }
//
//    @Basic
//    @Column(name = "ff_star_num")
//    public int getFfStarNum() {
//        return ffStarNum;
//    }
//
//    public void setFfStarNum(int ffStarNum) {
//        this.ffStarNum = ffStarNum;
//    }
//
//    @Basic
//    @Column(name = "ff_star_actual_num")
//    public int getFfStarActualNum() {
//        return ffStarActualNum;
//    }
//
//    public void setFfStarActualNum(int ffStarActualNum) {
//        this.ffStarActualNum = ffStarActualNum;
//    }
//
//    @Basic
//    @Column(name = "hr_state")
//    public int getHrState() {
//        return hrState;
//    }
//
//    public void setHrState(int hrState) {
//        this.hrState = hrState;
//    }
//
//    @Basic
//    @Column(name = "vip_level")
//    public int getVipLevel() {
//        return vipLevel;
//    }
//
//    public void setVipLevel(int vipLevel) {
//        this.vipLevel = vipLevel;
//    }
//
//    @Basic
//    @Column(name = "honor_num")
//    public int getHonorNum() {
//        return honorNum;
//    }
//
//    public void setHonorNum(int honorNum) {
//        this.honorNum = honorNum;
//    }
//
//    @Basic
//    @Column(name = "af_highest_liked_num")
//    public int getAfHighestLikedNum() {
//        return afHighestLikedNum;
//    }
//
//    public void setAfHighestLikedNum(int afHighestLikedNum) {
//        this.afHighestLikedNum = afHighestLikedNum;
//    }
//
//    @Basic
//    @Column(name = "sv_highest_liked_num")
//    public int getSvHighestLikedNum() {
//        return svHighestLikedNum;
//    }
//
//    public void setSvHighestLikedNum(int svHighestLikedNum) {
//        this.svHighestLikedNum = svHighestLikedNum;
//    }
//
//    @Basic
//    @Column(name = "cert_vip_level")
//    public int getCertVipLevel() {
//        return certVipLevel;
//    }
//
//    public void setCertVipLevel(int certVipLevel) {
//        this.certVipLevel = certVipLevel;
//    }
//
//    @Basic
//    @Column(name = "mt_collect_num")
//    public int getMtCollectNum() {
//        return mtCollectNum;
//    }
//
//    public void setMtCollectNum(int mtCollectNum) {
//        this.mtCollectNum = mtCollectNum;
//    }
//
//    @Basic
//    @Column(name = "hr_jobs_num")
//    public int getHrJobsNum() {
//        return hrJobsNum;
//    }
//
//    public void setHrJobsNum(int hrJobsNum) {
//        this.hrJobsNum = hrJobsNum;
//    }
//
//    @Basic
//    @Column(name = "cn_demand_num")
//    public int getCnDemandNum() {
//        return cnDemandNum;
//    }
//
//    public void setCnDemandNum(int cnDemandNum) {
//        this.cnDemandNum = cnDemandNum;
//    }
//
//    @Basic
//    @Column(name = "practice_num")
//    public int getPracticeNum() {
//        return practiceNum;
//    }
//
//    public void setPracticeNum(int practiceNum) {
//        this.practiceNum = practiceNum;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUser that = (TUser) o;
        return id == that.id &&
                role == that.role &&
                platform == that.platform &&
                gender == that.gender &&
                smallFishCurrency == that.smallFishCurrency &&
                bigFishCurrency == that.bigFishCurrency &&
                courseDuration == that.courseDuration &&
                pkgameAmount == that.pkgameAmount &&
                continuousCheckInDays == that.continuousCheckInDays &&
                resurrectionNum == that.resurrectionNum &&
                kingCoinAmount == that.kingCoinAmount &&
                ffAuthorType == that.ffAuthorType &&
                ffSubscribeNum == that.ffSubscribeNum &&
                ffArticleNum == that.ffArticleNum &&
                ffShareNum == that.ffShareNum &&
                ffShareActualNum == that.ffShareActualNum &&
                ffViewNum == that.ffViewNum &&
                ffViewActualNum == that.ffViewActualNum &&
                ffCollectNum == that.ffCollectNum &&
                ffCollectActualNum == that.ffCollectActualNum &&
                ffFavNum == that.ffFavNum &&
                ffSubNum == that.ffSubNum &&
                svVideoNum == that.svVideoNum &&
                svPlayedNum == that.svPlayedNum &&
                svLikedNum == that.svLikedNum &&
                svLikeNum == that.svLikeNum &&
                svSharedNum == that.svSharedNum &&
                afAskNum == that.afAskNum &&
                afAnswerNum == that.afAnswerNum &&
                afLikedNum == that.afLikedNum &&
                afCollectNum == that.afCollectNum &&
                afSharedNum == that.afSharedNum &&
                topCmtNum == that.topCmtNum &&
                followNum == that.followNum &&
                fanNum == that.fanNum &&
                level == that.level &&
                levelStar == that.levelStar &&
                state == that.state &&
                ffStarNum == that.ffStarNum &&
                ffStarActualNum == that.ffStarActualNum &&
                hrState == that.hrState &&
                vipLevel == that.vipLevel &&
                honorNum == that.honorNum &&
                afHighestLikedNum == that.afHighestLikedNum &&
                svHighestLikedNum == that.svHighestLikedNum &&
                certVipLevel == that.certVipLevel &&
                mtCollectNum == that.mtCollectNum &&
                hrJobsNum == that.hrJobsNum &&
                cnDemandNum == that.cnDemandNum &&
                practiceNum == that.practiceNum &&
                Objects.equals(openid, that.openid) &&
                Objects.equals(openidPro, that.openidPro) &&
                Objects.equals(openidAnd, that.openidAnd) &&
                Objects.equals(openidIos, that.openidIos) &&
                Objects.equals(openidH5, that.openidH5) &&
                Objects.equals(openidSearch, that.openidSearch) &&
                Objects.equals(sessionKey, that.sessionKey) &&
                Objects.equals(password, that.password) &&
                Objects.equals(nickName, that.nickName) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(unionid, that.unionid) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(email, that.email) &&
                Objects.equals(shadowAccount, that.shadowAccount) &&
                Objects.equals(shadowPassword, that.shadowPassword) &&
                Objects.equals(country, that.country) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(language, that.language) &&
                Objects.equals(uuid, that.uuid) &&
                Objects.equals(qrcodeUrl, that.qrcodeUrl) &&
                Objects.equals(signature, that.signature) &&
                Objects.equals(ffIntroduction, that.ffIntroduction) &&
                Objects.equals(hrName, that.hrName) &&
                Objects.equals(hrValidateTel, that.hrValidateTel) &&
                Objects.equals(hrPosition, that.hrPosition) &&
                Objects.equals(hrCompany, that.hrCompany) &&
                Objects.equals(hrPublicTel, that.hrPublicTel) &&
                Objects.equals(hrPublicEmail, that.hrPublicEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, openid, openidPro, openidAnd, openidIos, openidH5, openidSearch, sessionKey, password, nickName, avatar, unionid, createTime, updateTime, mobile, role, email, shadowAccount, shadowPassword, platform, gender, country, province, city, language, smallFishCurrency, bigFishCurrency, courseDuration, pkgameAmount, uuid, qrcodeUrl, continuousCheckInDays, resurrectionNum, kingCoinAmount, signature, ffAuthorType, ffIntroduction, ffSubscribeNum, ffArticleNum, ffShareNum, ffShareActualNum, ffViewNum, ffViewActualNum, ffCollectNum, ffCollectActualNum, ffFavNum, ffSubNum, svVideoNum, svPlayedNum, svLikedNum, svLikeNum, svSharedNum, afAskNum, afAnswerNum, afLikedNum, afCollectNum, afSharedNum, topCmtNum, hrName, hrValidateTel, hrPosition, hrCompany, hrPublicTel, hrPublicEmail, followNum, fanNum, level, levelStar, state, ffStarNum, ffStarActualNum, hrState, vipLevel, honorNum, afHighestLikedNum, svHighestLikedNum, certVipLevel, mtCollectNum, hrJobsNum, cnDemandNum, practiceNum);
    }
}
