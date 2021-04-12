package EffectiveJava.StaticFactory;

public class MemberDto {
    String id;
    String name;

    public MemberDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MemberDto from(Member member) {
        return new MemberDto(member.id, member.name);
    }
    public String toString(){
        return "ID : "+this.id +" ,  NAME :"+ this.name;
    }
}
