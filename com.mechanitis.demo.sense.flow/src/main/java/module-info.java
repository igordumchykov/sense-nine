// this module is only required when you need to convert between j.u.c.Flow and reactive streams implementations
module com.mechanitis.demo.sense.flow {
    requires java.logging;
    requires org.reactivestreams;

    exports com.mechanitis.demo.sense.flow;
}