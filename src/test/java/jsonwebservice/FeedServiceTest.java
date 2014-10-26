package jsonwebservice;

import com.android.dev.FeedService;

import junit.framework.TestCase;

public class FeedServiceTest extends TestCase {

	//private static final Logger log = Logger.getLogger(FeedServiceTest.class);
	
	public void testFeed() {
		
		FeedService feedService = new FeedService();
		String actual = feedService.feed();
		System.out.println("feed data"+actual);
		String expected = "[{\"title\":\"title1\",\"description\":\"desc1\"},{\"title\":\"title2\",\"description\":\"desc2\"}]";
		assertEquals(expected, actual);
	}

	public void testAdd(){
		FeedService feedService =new FeedService();
		double c = feedService.add(5, 4);
		assertEquals(9,c,0);
	}
	
}
