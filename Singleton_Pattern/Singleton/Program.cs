using Singleton;

Thread t1 =new Thread(() =>
{
    var instance = UploadService.Instance(1);
});

Thread t2 =new Thread(() =>
{
    var instance = UploadService.Instance(2);
});