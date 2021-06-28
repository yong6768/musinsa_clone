package musinsa.clone.__init__;

import musinsa.clone.domain.brand.entity.BrandEntity;
import musinsa.clone.domain.brand.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ConditionalOnProperty(prefix = "custom", name="init-data", havingValue = "true")
public class BrandInit {

    @Autowired
    private BrandRepository brandRepository;

    @PostConstruct
    public void init() {
        createBrand();
    }

    private void createBrand() {
        String[][] brandList = {
                {"5252BYOIOI","5252 바이 오아이오아이"},
                {"ACOVER","어커버"},
                {"ADIDAS","아디다스"},
                {"AHWE","아위"},
                {"AMOMENTO","아모멘토"},
                {"AMONG","어몽"},
                {"ANDERSSON BELL","앤더슨벨"},
                {"ANDERSSON BELL for WOMEN","앤더슨벨 포 우먼"},
                {"ANOBLIR","아노블리어"},
                {"ARCHIVEPKE","아카이브앱크"},
                {"ATELIERPARK","아틀리에파크"},
                {"BADBLOOD","배드블러드"},
                {"BADEE","배디"},
                {"BARREL","배럴"},
                {"BENSIMON","벤시몽"},
                {"BESLOW","비슬로우"},
                {"BIRKENSTOCK","버켄스탁"},
                {"BRANDED","브랜디드"},
                {"BRENSON","브렌슨"},
                {"CARHARTT","칼하트"},
                {"CITY BREEZE","시티브리즈"},
                {"CLOTTY","클로티"},
                {"CONVERSE","컨버스"},
                {"COSTUME O’CLOCK","커스텀어클락"},
                {"COVERNAT","커버낫"},
                {"CRANK","크랭크"},
                {"CURETTY","큐리티"},
                {"CURRENT","커렌트"},
                {"DISCOVERY EXPEDITION","디스커버리 익스페디션"},
                {"DR.MARTENS","닥터마틴"},
                {"DRAW FIT","드로우핏"},
                {"ELBATEGEV","엘바테게브"},
                {"EN OR","엔오르"},
                {"ETMON","에트몽"},
                {"FATALISM","페이탈리즘"},
                {"FENNEC","페넥"},
                {"FIND KAPOOR","파인드카푸어"},
                {"FRIZMWORKS","프리즘웍스"},
                {"GIORDANO","지오다노"},
                {"GRISH","그리쉬"},
                {"GROOVE RHYME","그루브라임"},
                {"HACKESCH","하케쉬"},
                {"IL-O-GONG-CHIL","일오공칠"},
                {"IN SILENCE","인사일런스"},
                {"INSILENCE WOMEN","인사일런스 우먼"},
                {"INSTANTFUNK","인스턴트펑크"},
                {"JEMUT","제멋"},
                {"JESTINA","제이에스티나"},
                {"JOSEPH&STACEY","조셉앤스테이시"},
                {"KIRSH","키르시"},
                {"LAB12","랩12"},
                {"LAFUDGE FOR WOMAN","라퍼지 포 우먼"},
                {"LAFUDGESTORE","라퍼지스토어"},
                {"LAP","랩"},
                {"LEE","리"},
                {"LMC","엘엠씨"},
                {"LUV IS TRUE","러브이즈트루"},
                {"MAINBOOTH","메인부스"},
                {"MAISON MINED","메종미네드"},
                {"MARDI MERCREDI","마르디 메크르디"},
                {"MARGARIN FINGERS","마가린핑거스"},
                {"MARITHE FRANCOIS GIRBAUD","마리떼"},
                {"MARK GONZALES","마크 곤잘레스"},
                {"MINAV","미나브"},
                {"MLB","엠엘비"},
                {"MMLG","엠엠엘지"},
                {"MODNINE","모드나인"},
                {"MUSINSA STANDARD","무신사 스탠다드"},
                {"NASTY FANCY CLUB","네스티팬시클럽"},
                {"NATIONALGEOGRAPHIC","내셔널지오그래픽"},
                {"NIKE","나이키"},
                {"ODDONEOUT","오드원아웃"},
                {"PAINORPLEASURE","페인오어플레져"},
                {"PARTIMENTO","파르티멘토"},
                {"PIECE WORKER","피스워커"},
                {"POLO RALPH LAUREN","폴로 랄프 로렌"},
                {"RAIVE","레이브"},
                {"REORG","리올그"},
                {"ROCKFISH WEATHERWEAR","락피쉬웨더웨어"},
                {"ROH SEOUL","로서울"},
                {"ROLAROLA","로라로라"},
                {"SAMO ONDOH","세이모 온도"},
                {"SCULPTOR","스컬프터"},
                {"SEVENSELAH","세븐셀라"},
                {"SOFT SEOUL","소프트서울"},
                {"SPAO","스파오"},
                {"SUARE","수아레"},
                {"TAW&TOE","토앤토"},
                {"THISISNEVERTHAT","디스이즈네버댓"},
                {"TOFFEE","토피"},
                {"TRAVEL","트래블"},
                {"UMBRO","엄브로"},
                {"UNIFORM BRIDGE","유니폼브릿지"},
                {"VANS","반스"},
                {"VIAPLAIN","비아플레인"},
                {"VIVASTUDIO","비바스튜디오"},
                {"WHOLOVESART","후러브스아트"},
                {"WV PROJECT","더블유브이프로젝트"},
                {"XERO","제로"},
                {"YALE","예일"},
                {"YASE","야세"},
                {"YESEYESEE","예스아이씨"},
                {"YOUR LIFE HERE","유어라이프히얼"},

        };

        for (String[] brand : brandList) {
            String engName = brand[0];
            String name = brand[1];

            BrandEntity brandEntity = BrandEntity.of(name, engName);
            brandRepository.save(brandEntity);
        }
    }
}
