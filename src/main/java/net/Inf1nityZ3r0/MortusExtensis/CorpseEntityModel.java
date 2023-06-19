package net.Inf1nityZ3r0.MortusExtensis;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class CorpseEntityModel extends EntityModel<CorpseEntity> {
    private final ModelPart base;
    public CorpseEntityModel(ModelPart modelPart){
        this.base = modelPart.getChild(EntityModelPartNames.CORPSE);
    }

    public static TexturedModelData getTexturedModelData() {
    }
}
