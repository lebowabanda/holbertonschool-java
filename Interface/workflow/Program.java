   public class Program {
        public static void main(String[] args) {
            VideoProcessor videoProcessor1 = new VideoProcessor();
            videoProcessor1.registerChannel(new Slack());
            videoProcessor1.registerChannel(new Teams());

            VideoProcessor videoProcessor2 = new VideoProcessor();
            videoProcessor2.registerChannel(new Slack());
            videoProcessor2.registerChannel(new Email());

            VideoProcessor videoProcessor3 = new VideoProcessor();
            videoProcessor3.registerChannel(new Sms());

            VideoProcessor videoProcessor4 = new VideoProcessor();

            VideoProcessor videoProcessor5 = new VideoProcessor();
            videoProcessor5.registerChannel(new Sms());
            videoProcessor5.registerChannel(new Slack());
            videoProcessor5.registerChannel(new Email());
            videoProcessor5.registerChannel(new Teams());        

            Video video1 = new Video("video1.mpg", FormatVideo.MPEG);
            Video video2 = new Video("video2.avi", FormatVideo.AVI);
            Video video3 = new Video("video3.mkv", FormatVideo.MKV);

            videoProcessor1.process(video1);

            System.out.println();

            videoProcessor2.process(video1);

            System.out.println();

            videoProcessor3.process(video2);        

            System.out.println();

            videoProcessor4.process(video3);   

            System.out.println();

            videoProcessor5.process(video3);   
        }
    }