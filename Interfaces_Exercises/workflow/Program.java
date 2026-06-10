import activity.*;

public class Program {
    public static void main(String[] args) {

        WorkflowMachine workflowMachine = new WorkflowMachine();

        Workflow workflowEncodeVideos = new Workflow();

        workflowEncodeVideos.registerActivity(new UploadVideo());
        workflowEncodeVideos.registerActivity(new EncodeVideo());
        workflowEncodeVideos.registerActivity(new SendEmail());

        workflowMachine.execute(workflowEncodeVideos);

        System.out.println("-----");

        Workflow workflowVideos = new Workflow();

        workflowVideos.registerActivity(new UploadVideo());
        workflowVideos.registerActivity(new SendEmail());

        workflowMachine.execute(workflowVideos);

        System.out.println("-----");

        Workflow workflowVideosStatus = new Workflow();

        workflowVideosStatus.registerActivity(new UploadVideo());
        workflowVideosStatus.registerActivity(new ModifyVideoStatus());
        workflowVideosStatus.registerActivity(new SendEmail());

        workflowMachine.execute(workflowVideosStatus);
    }
}