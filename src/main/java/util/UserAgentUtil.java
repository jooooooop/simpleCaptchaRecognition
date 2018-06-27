package util;

import org.apache.commons.lang.math.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class UserAgentUtil {

	public static String getPcUserAgent() {
		int index = RandomUtils.nextInt(pcUserAgentList.size());
		String userAgent = pcUserAgentList.get(index);
		return userAgent;
	}

	public static String getMobileUserAgent() {
		int index = RandomUtils.nextInt(mobileUserAgentList.size());
		String userAgent = mobileUserAgentList.get(index);
		return userAgent;
	}

	static List<String> pcUserAgentList = new ArrayList<String>();
	static {
		pcUserAgentList.add("Mozilla/4.0 (compatible; GoogleToolbar 5.0.2124.2070; Windows 6.0; MSIE 8.0.6001.18241)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; AOL 9.0; Windows NT 5.1; iebar; .NET CLR 1.0.3705)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Win32);");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Win32); .NET CLR 1.0.3705)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows 98)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Hotbar 4.4.6.0)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Win 9x 4.90)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 4.0)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 4.0; BVG");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; .NET CLR 1");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; .NET CLR 1.0.3705; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; .NET CLR 1.1.4322; FDM)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; {FF0C8E09-3C86-44CB-834A-B8CEEC80A1D7}; iOpus-I-M)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; i-Nav 3.0.1.0F; .NET CLR 1.0.3705; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; ja) Opera 9.00");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; MathPlayer 2.0; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; Maxthon; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; T312461)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0;)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1);");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; .NET CLR 1");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; .NET CLR 1.0.3705)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; .NET CLR 1.0.3705; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; .NET CLR 1.1.4322; .NET CLR 1.0.3705)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; .NET CLR 2.0.40607)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; Alexa Toolbar)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; BrowserBob)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; DFO-MPO Internet Explorer 6.0)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; en) Opera 9.00");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; ENGINE; Mozilla/4.0 (compatible; MSIE 6.0; Windows NT))");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; ESB{F40811EE-DF17-4BC9-8785-B362ABF34098}; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; FDM)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; FTDv3 Browser; .NET CLR 1.0.3705; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; FunWebProducts; .NET CLR 1.1.4322; .NET CLR 2.0.40607)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; FunWebProducts; AtHome033)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; HCI0449; .NET CLR 1.0.3705)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; i-NavFourF; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; Maxthon;");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; Maxthon; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; MyIE2; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; MyIE2; Maxthon; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; Q312461; FunWebProducts; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.0.3705; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 1.0.3705)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.40607)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.40607; .NET CLR 1.0.3705)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; NOKTURNAL KICKS ASS)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; FDM;");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; Maxthon; .NET CLR 1.1.4322; .NET CLR 2.0.41115)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; Woningstichting Den Helder; .NET CLR 1.0.3705)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; .NET CLR 1.1.4322; .NET CLR 2.0.41115)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; MyIE2; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; MyIE2; Maxthon; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows XP)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 6.0; X11; Linux i686; ja) Opera 10.10");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; .NET CLR 1.1.4322; .NET CLR 2.0.50727; .NET CLR 3.0.04506.30)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; SV1)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; SV1; .NET CLR 1.0.3705; .NET CLR 2.0.50727; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727; InfoPath.1)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0; SLCC1; .NET CLR 2.0.50727; Media Center PC 5.0; .NET CLR 3.0.04506)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0; SLCC1; .NET CLR 2.0.50727; Media Center PC 5.0; .NET CLR 3.0.04506; InfoPath.1)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; .NET CLR 2.0.50727; .NET CLR 3.0.04506.30; .NET CLR 3.0.04506.648)");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; .NET CLR 2.0.50727; InfoPath.1");
		pcUserAgentList.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; EasyBits GO v1.0; InfoPath.1; .NET CLR 2.0.50727; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729)");
		pcUserAgentList.add("Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; Trident/6.0)");
		pcUserAgentList.add("Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; ARM; Trident/6.0)");
		pcUserAgentList.add("Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; Trident/6.0)");
		pcUserAgentList.add("Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; Win64; x64; Trident/6.0)");
		pcUserAgentList.add("Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; Win64; x64; Trident/6.0)");
		pcUserAgentList.add("Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; WOW64; Trident/6.0)");
		pcUserAgentList.add("Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.0; Trident/5.0)");
		pcUserAgentList.add("Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0)");
		pcUserAgentList.add("Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0; Sleipnir/2.9.8)");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.5; rv:5.0.1) Gecko/20100101 Firefox/5.0.1");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.5; rv:8.0.1) Gecko/20100101 Firefox/8.0.1");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:6.0.2) Gecko/20100101 Firefox/6.0.2");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:7.0.1) Gecko/20100101 Firefox/7.0.1");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:9.0.1) Gecko/20100101 Firefox/9.0.1");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.24 (KHTML, like Gecko) Chrome/11.0.696.71 Safari/534.24");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.24 (KHTML, like Gecko) Iron/11.0.700.2 Chrome/11.0.700.2 Safari/534.24");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.30 (KHTML, like Gecko) Chrome/12.0.742.112 Safari/534.30");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.52.7 (KHTML, like Gecko) Version/5.1.2 Safari/534.52.7");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.57.2 (KHTML, like Gecko) Version/5.1.7 Safari/534.57.2");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/13.0.782.112 Safari/535.1");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/13.0.782.220 Safari/535.1");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/14.0.835.202 Safari/535.1");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/535.1 (KHTML, like Gecko) RockMelt/0.9.64.361 Chrome/13.0.782.218 Safari/535.1");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/535.7 (KHTML, like Gecko) Chrome/16.0.912.75 Safari/535.7");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/535.2 (KHTML, like Gecko) Chrome/15.0.874.106 Safari/535.2");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8) AppleWebKit/536.25 (KHTML, like Gecko) Version/6.0 Safari/536.25");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; N; PPC; ja-JP; macja-pub12) Gecko/20001108 Netscape6/6.0");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_5_6; ja-jp) AppleWebKit/528.16 (KHTML, like Gecko) Version/4.0 Safari/528.16");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_2; ja-jp) AppleWebKit/531.21.8 (KHTML, like Gecko) Version/4.0.4 Safari/531.21.10");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_3; ja-jp) AppleWebKit/531.21.11 (KHTML, like Gecko) Version/4.0.4 Safari/531.21.10");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_3; ja-jp) AppleWebKit/533.16 (KHTML, like Gecko) Version/5.0 Safari/533.16");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; en-US; rv:1.6) Gecko/20040113");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; ja-JP; rv:1.4) Gecko/20030624 Netscape/7.1");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; U; PPC Mac OS X; en-US; rv:0.9.4.1) Gecko/20020315 Netscape6/6.2.2");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; U; PPC Mac OS X; ja-JP; rv:1.0.2) Gecko/20021120 Netscape/7.01");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; U; PPC; ja-JP; rv:0.9.2) Gecko/20010726 Netscape6/6.1");
		pcUserAgentList.add("Mozilla/5.0 (Macintosh; U; PPC; ja-JP; rv:0.9.4) Gecko/20011022 Netscape6/6.2");
		pcUserAgentList.add("Mozilla/5.0 (Windows NT 5.1) AppleWebKit/534.30 (KHTML, like Gecko) Chrome/12.0.742.122 Safari/534.30 ChromePlus/1.6.3.1");
		pcUserAgentList.add("Mozilla/5.0 (Windows NT 5.1) AppleWebKit/535.2 (KHTML, like Gecko) Chrome/15.0.874.120 Safari/535.2");
		pcUserAgentList.add("Mozilla/5.0 (Windows NT 5.1; rv:6.0) Gecko/20100101 Firefox/6.0");
		pcUserAgentList.add("Mozilla/5.0 (Windows NT 6.0; rv:7.0.1) Gecko/20100101 Firefox/7.0.1");
		pcUserAgentList.add("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/534.24 (KHTML, like Gecko) Chrome/11.0.696.65 Safari/534.24");
		pcUserAgentList.add("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/13.0.782.107 Safari/535.1");
		pcUserAgentList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/14.0.835.202 Safari/535.1");
		pcUserAgentList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.7 (KHTML, like Gecko) Chrome/16.0.912.75 Safari/535.7");
		pcUserAgentList.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0");
		pcUserAgentList.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:9.0.1) Gecko/20100101 Firefox/9.0.1");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Win 9x 4.90; ja-JP; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.0.2) Gecko/20030208 Netscape/7.02");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Win98; ja-JP; m18) Gecko/20001108 Netscape6/6.0");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.7) Gecko/20040616");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Windows NT 5.0; ja-JP; m18) Gecko/20010131 Netscape6/6.01");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Windows NT 5.0; ja-JP; rv:1.5) Gecko/20031007");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/534.16 (KHTML, like Gecko) Chrome/10.0.648.151 Safari/534.16");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.6) Gecko/20040113");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.2) Gecko/20040804 Netscape/7.2 (ax)");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Windows NT 5.1; ja-JP; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3");
		pcUserAgentList.add("Mozilla/5.0 (Windows; U; Windows NT 5.1; ja-JP; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)");
		pcUserAgentList.add("Mozilla/5.0 (X11; Linux i686) AppleWebKit/535.2 (KHTML, like Gecko) Ubuntu/10.04 Chromium/15.0.874.106 Chrome/15.0.874.106 Safari/535.2");
		pcUserAgentList.add("Mozilla/5.0 (X11; U; FreeBSD i386; en-US; rv:1.7.1) Gecko/20040805");
		pcUserAgentList.add("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.7.2) Gecko/20040805 Netscape/7.2");
		pcUserAgentList.add("Mozilla/5.0 (X11; U; Linux i686; ja-JP; rv:1.2.1) Gecko/20030225");
		pcUserAgentList.add("Mozilla/5.0 (X11; U; Linux i686; ja-JP; rv:1.4.1) Gecko/20031030");
		pcUserAgentList.add("Mozilla/5.0 (X11; U; SunOS sun4u; ja-JP; rv:1.0.1) Gecko/20020921 Netscape/7.0");
		pcUserAgentList.add("Mozilla/5.0 (X11; U; SunOS sun4u; ja-JP; rv:1.4) Gecko/20040414");
		pcUserAgentList.add("MSIE 6.0; Windows 2000");
		pcUserAgentList.add("Opera/9.0 (Windows NT 5.1; U; en)");
		pcUserAgentList.add("Opera/9.00 (Macintosh; PPC Mac OS X; U; ja)");
		pcUserAgentList.add("Opera/9.00 (Windows NT 5.1; U; ja)");
		pcUserAgentList.add("Opera/9.02 (Macintosh; PPC Mac OS X; U; ja)");
		pcUserAgentList.add("Opera/9.02 (Windows NT 5.1; U; zh-tw)");
		pcUserAgentList.add("Opera/9.10 (Windows NT 6.0; U; ja)");
		pcUserAgentList.add("Opera/9.21 (Windows NT 6.0; U; ja)");
		pcUserAgentList.add("Opera/9.22 (Windows NT 5.1; U; ja)");
		pcUserAgentList.add("Opera/9.23 (Windows ME; U; ja)");
		pcUserAgentList.add("Opera/9.23 (Windows NT 5.1; U; ja)");
		pcUserAgentList.add("Opera/9.26 (Windows NT 5.1; U; ja)");
		pcUserAgentList.add("Opera/9.51 (Windows NT 5.1; U; ja)");
		pcUserAgentList.add("Opera/9.52 (Macintosh; Intel Mac OS X; U; ja)");
		pcUserAgentList.add("Opera/9.52 (Windows NT 5.1; U; ja)");
		pcUserAgentList.add("Opera/9.60 (Macintosh; Intel Mac OS X; U; ja) Presto/2.1.1");
		pcUserAgentList.add("Opera/9.60 (Windows NT 5.1; U; ja) Presto/2.1.1");
		pcUserAgentList.add("Opera/9.61 (Windows NT 5.1; U; ja) Presto/2.1.1");
		pcUserAgentList.add("Opera/9.62 (Windows NT 5.1; U; ja) Presto/2.1.1");
		pcUserAgentList.add("Opera/9.80 (Macintosh; Intel Mac OS X 10.6.8; U; ja) Presto/2.10.289 Version/12.00");
		pcUserAgentList.add("Opera/9.80 (Windows NT 6.1; U; ja) Presto/2.10.229 Version/11.60");
		pcUserAgentList.add("Opera/9.80 (Windows NT 6.1; U; ja) Presto/2.9.168 Version/11.50");
	}

	static List<String> mobileUserAgentList = new ArrayList<String>();
	static {
		mobileUserAgentList.add("Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36 SE 2.X MetaSr 1.0");
		mobileUserAgentList.add("Mozilla/5.0 (Linux; U; Android 4.0.2; en-us; Galaxy Nexus Build/ICL53F) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30");
		mobileUserAgentList.add("Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36 SE 2.X MetaSr 1.0");
		mobileUserAgentList.add("Mozilla/5.0 (Linux; U; Android 4.1.1; zh-CN; GT-N7100 Build/JRO03C) AppleWebKit/534.31 (KHTML, like Gecko) UCBrowser/9.3.0.321 U3/0.8.0 Mobile Safari/534.31");
		mobileUserAgentList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36 SE 2.X MetaSr 1.0");
		mobileUserAgentList.add("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36 SE 2.X MetaSr 1.0");
		mobileUserAgentList.add("Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2.8) Gecko/20100722 Firefox/3.6.8");
		mobileUserAgentList.add("Opera/12.02 (Android 4.1; Linux; Opera Mobi/ADR-1111101157; U; en-US) Presto/2.9.201 Version/12.02");
		mobileUserAgentList.add("Mozilla/5.0 (Linux; U; Android 2.3.5; zh-cn; GT-I9100G Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");
		mobileUserAgentList.add("Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16");
		mobileUserAgentList.add("Mozilla/5.0 (iPhone; CPU iPhone OS 8_2 like Mac OS X; zh-CN) AppleWebKit/537.51.1 (KHTML, like Gecko) Mobile/12D508 UCBrowser/10.3.5.558 Mobile");
		mobileUserAgentList.add("Mozilla/5.0 (iPhone; CPU iPhone OS 8_1_3 like Mac OS X; zh-CN) AppleWebKit/537.51.1 (KHTML, like Gecko) Mobile/12B466 UCBrowser/10.3.5.558 Mobile");
		mobileUserAgentList.add("Mozilla/5.0 (Linux; U; Android 4.3; en-us; SM-N900T Build/JSS15J) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30");
		mobileUserAgentList.add("Opera/9.80 (Android; Opera Mini/7.8.35885/35.5464; U; zh) Presto/2.8.119 Version/11.10");
		mobileUserAgentList.add("Mozilla/5.0 (Linux; U; Android 4.4.2; zh-cn; GT-I9500 Build/KOT49H) AppleWebKit/537.36 (KHTML, like Gecko)Version/4.0 MQQBrowser/5.0 QQ-Manager Mobile Safari/537.36");
		mobileUserAgentList.add("Mozilla/5.0 (iPhone; CPU iPhone OS 7_1_2 like Mac OS X; zh-CN) AppleWebKit/537.51.1 (KHTML, like Gecko) Mobile/11D257 UCBrowser/10.3.5.558 Mobile");
		mobileUserAgentList.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.76 Safari/537.36");
		mobileUserAgentList.add("Mozilla/5.0 (iPhone; CPU iPhone OS 8_2 like Mac OS X) AppleWebKit/600.1.4 (KHTML, like Gecko) Version/8.0 Mobile/12D508 Safari/600.1.4");
		mobileUserAgentList.add("Mozilla/5.0 (Linux; Android 4.1.1; Nexus 7 Build/JRO03D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166  Safari/535.19");
		mobileUserAgentList.add("Mozilla/5.0 (iPhone; CPU iPhone OS 8_1_3 like Mac OS X) AppleWebKit/600.1.4 (KHTML, like Gecko) Version/8.0 Mobile/12B466 Safari/600.1.4");
		mobileUserAgentList.add("Mozilla/5.0 (iPhone; CPU iPhone OS 8_1_2 like Mac OS X; zh-CN) AppleWebKit/537.51.1 (KHTML, like Gecko) Mobile/12B440 UCBrowser/10.3.5.558 Mobile");
		mobileUserAgentList.add("Mozilla/5.0 (iPhone; CPU iPhone OS 7_1_2 like Mac OS X) AppleWebKit/537.51.2 (KHTML, like Gecko) Version/7.0 Mobile/11D257 Safari/9537.53");
		mobileUserAgentList.add("Mozilla/5.0 (Linux; U; Android 4.1.1; zh-cn; MI 2S Build/JRO03L) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Mobile Safari/537.36 XiaoMi/MiuiBrowser/2.1.1");
	}
}
