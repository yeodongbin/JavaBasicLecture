package genernic_inheritance;

public interface IParent <T, M> {}

interface IChild<T, M> extends IParent<T, M> {}
