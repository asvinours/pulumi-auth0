// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to manage branding within your Auth0 tenant. Auth0 can be customized with a look and feel that aligns with your organization's brand requirements and user expectations.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"io/ioutil"
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := ioutil.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.NewBranding(ctx, "myBrand", &auth0.BrandingArgs{
//				LogoUrl: pulumi.String("https://mycompany.org/logo.png"),
//				Colors: &BrandingColorsArgs{
//					Primary:        pulumi.String("#0059d6"),
//					PageBackground: pulumi.String("#000000"),
//				},
//				UniversalLogin: &BrandingUniversalLoginArgs{
//					Body: readFileOrPanic("universal_login_body.html"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # As this is not a resource identifiable by an ID within the Auth0 Management API, # branding can be imported using a random string. # # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # # Example
//
// ```sh
//
//	$ pulumi import auth0:index/branding:Branding my_brand 22f4f21b-017a-319d-92e7-2291c1ca36c4
//
// ```
type Branding struct {
	pulumi.CustomResourceState

	// Configuration settings for colors for branding.
	Colors BrandingColorsPtrOutput `pulumi:"colors"`
	// URL for the favicon.
	FaviconUrl pulumi.StringOutput `pulumi:"faviconUrl"`
	// Configuration settings to customize the font.
	Font BrandingFontPtrOutput `pulumi:"font"`
	// URL of logo for branding.
	LogoUrl pulumi.StringOutput `pulumi:"logoUrl"`
	// Configuration settings for Universal Login.
	UniversalLogin BrandingUniversalLoginPtrOutput `pulumi:"universalLogin"`
}

// NewBranding registers a new resource with the given unique name, arguments, and options.
func NewBranding(ctx *pulumi.Context,
	name string, args *BrandingArgs, opts ...pulumi.ResourceOption) (*Branding, error) {
	if args == nil {
		args = &BrandingArgs{}
	}

	var resource Branding
	err := ctx.RegisterResource("auth0:index/branding:Branding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBranding gets an existing Branding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBranding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BrandingState, opts ...pulumi.ResourceOption) (*Branding, error) {
	var resource Branding
	err := ctx.ReadResource("auth0:index/branding:Branding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Branding resources.
type brandingState struct {
	// Configuration settings for colors for branding.
	Colors *BrandingColors `pulumi:"colors"`
	// URL for the favicon.
	FaviconUrl *string `pulumi:"faviconUrl"`
	// Configuration settings to customize the font.
	Font *BrandingFont `pulumi:"font"`
	// URL of logo for branding.
	LogoUrl *string `pulumi:"logoUrl"`
	// Configuration settings for Universal Login.
	UniversalLogin *BrandingUniversalLogin `pulumi:"universalLogin"`
}

type BrandingState struct {
	// Configuration settings for colors for branding.
	Colors BrandingColorsPtrInput
	// URL for the favicon.
	FaviconUrl pulumi.StringPtrInput
	// Configuration settings to customize the font.
	Font BrandingFontPtrInput
	// URL of logo for branding.
	LogoUrl pulumi.StringPtrInput
	// Configuration settings for Universal Login.
	UniversalLogin BrandingUniversalLoginPtrInput
}

func (BrandingState) ElementType() reflect.Type {
	return reflect.TypeOf((*brandingState)(nil)).Elem()
}

type brandingArgs struct {
	// Configuration settings for colors for branding.
	Colors *BrandingColors `pulumi:"colors"`
	// URL for the favicon.
	FaviconUrl *string `pulumi:"faviconUrl"`
	// Configuration settings to customize the font.
	Font *BrandingFont `pulumi:"font"`
	// URL of logo for branding.
	LogoUrl *string `pulumi:"logoUrl"`
	// Configuration settings for Universal Login.
	UniversalLogin *BrandingUniversalLogin `pulumi:"universalLogin"`
}

// The set of arguments for constructing a Branding resource.
type BrandingArgs struct {
	// Configuration settings for colors for branding.
	Colors BrandingColorsPtrInput
	// URL for the favicon.
	FaviconUrl pulumi.StringPtrInput
	// Configuration settings to customize the font.
	Font BrandingFontPtrInput
	// URL of logo for branding.
	LogoUrl pulumi.StringPtrInput
	// Configuration settings for Universal Login.
	UniversalLogin BrandingUniversalLoginPtrInput
}

func (BrandingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*brandingArgs)(nil)).Elem()
}

type BrandingInput interface {
	pulumi.Input

	ToBrandingOutput() BrandingOutput
	ToBrandingOutputWithContext(ctx context.Context) BrandingOutput
}

func (*Branding) ElementType() reflect.Type {
	return reflect.TypeOf((**Branding)(nil)).Elem()
}

func (i *Branding) ToBrandingOutput() BrandingOutput {
	return i.ToBrandingOutputWithContext(context.Background())
}

func (i *Branding) ToBrandingOutputWithContext(ctx context.Context) BrandingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrandingOutput)
}

// BrandingArrayInput is an input type that accepts BrandingArray and BrandingArrayOutput values.
// You can construct a concrete instance of `BrandingArrayInput` via:
//
//	BrandingArray{ BrandingArgs{...} }
type BrandingArrayInput interface {
	pulumi.Input

	ToBrandingArrayOutput() BrandingArrayOutput
	ToBrandingArrayOutputWithContext(context.Context) BrandingArrayOutput
}

type BrandingArray []BrandingInput

func (BrandingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Branding)(nil)).Elem()
}

func (i BrandingArray) ToBrandingArrayOutput() BrandingArrayOutput {
	return i.ToBrandingArrayOutputWithContext(context.Background())
}

func (i BrandingArray) ToBrandingArrayOutputWithContext(ctx context.Context) BrandingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrandingArrayOutput)
}

// BrandingMapInput is an input type that accepts BrandingMap and BrandingMapOutput values.
// You can construct a concrete instance of `BrandingMapInput` via:
//
//	BrandingMap{ "key": BrandingArgs{...} }
type BrandingMapInput interface {
	pulumi.Input

	ToBrandingMapOutput() BrandingMapOutput
	ToBrandingMapOutputWithContext(context.Context) BrandingMapOutput
}

type BrandingMap map[string]BrandingInput

func (BrandingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Branding)(nil)).Elem()
}

func (i BrandingMap) ToBrandingMapOutput() BrandingMapOutput {
	return i.ToBrandingMapOutputWithContext(context.Background())
}

func (i BrandingMap) ToBrandingMapOutputWithContext(ctx context.Context) BrandingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrandingMapOutput)
}

type BrandingOutput struct{ *pulumi.OutputState }

func (BrandingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Branding)(nil)).Elem()
}

func (o BrandingOutput) ToBrandingOutput() BrandingOutput {
	return o
}

func (o BrandingOutput) ToBrandingOutputWithContext(ctx context.Context) BrandingOutput {
	return o
}

// Configuration settings for colors for branding.
func (o BrandingOutput) Colors() BrandingColorsPtrOutput {
	return o.ApplyT(func(v *Branding) BrandingColorsPtrOutput { return v.Colors }).(BrandingColorsPtrOutput)
}

// URL for the favicon.
func (o BrandingOutput) FaviconUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Branding) pulumi.StringOutput { return v.FaviconUrl }).(pulumi.StringOutput)
}

// Configuration settings to customize the font.
func (o BrandingOutput) Font() BrandingFontPtrOutput {
	return o.ApplyT(func(v *Branding) BrandingFontPtrOutput { return v.Font }).(BrandingFontPtrOutput)
}

// URL of logo for branding.
func (o BrandingOutput) LogoUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Branding) pulumi.StringOutput { return v.LogoUrl }).(pulumi.StringOutput)
}

// Configuration settings for Universal Login.
func (o BrandingOutput) UniversalLogin() BrandingUniversalLoginPtrOutput {
	return o.ApplyT(func(v *Branding) BrandingUniversalLoginPtrOutput { return v.UniversalLogin }).(BrandingUniversalLoginPtrOutput)
}

type BrandingArrayOutput struct{ *pulumi.OutputState }

func (BrandingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Branding)(nil)).Elem()
}

func (o BrandingArrayOutput) ToBrandingArrayOutput() BrandingArrayOutput {
	return o
}

func (o BrandingArrayOutput) ToBrandingArrayOutputWithContext(ctx context.Context) BrandingArrayOutput {
	return o
}

func (o BrandingArrayOutput) Index(i pulumi.IntInput) BrandingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Branding {
		return vs[0].([]*Branding)[vs[1].(int)]
	}).(BrandingOutput)
}

type BrandingMapOutput struct{ *pulumi.OutputState }

func (BrandingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Branding)(nil)).Elem()
}

func (o BrandingMapOutput) ToBrandingMapOutput() BrandingMapOutput {
	return o
}

func (o BrandingMapOutput) ToBrandingMapOutputWithContext(ctx context.Context) BrandingMapOutput {
	return o
}

func (o BrandingMapOutput) MapIndex(k pulumi.StringInput) BrandingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Branding {
		return vs[0].(map[string]*Branding)[vs[1].(string)]
	}).(BrandingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BrandingInput)(nil)).Elem(), &Branding{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrandingArrayInput)(nil)).Elem(), BrandingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrandingMapInput)(nil)).Elem(), BrandingMap{})
	pulumi.RegisterOutputType(BrandingOutput{})
	pulumi.RegisterOutputType(BrandingArrayOutput{})
	pulumi.RegisterOutputType(BrandingMapOutput{})
}
